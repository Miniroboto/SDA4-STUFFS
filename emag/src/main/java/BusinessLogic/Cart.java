package BusinessLogic;

import Model.Item;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static BusinessLogic.WriteToFile.writeToFile;

public class Cart {
    private static final int ADDITION_SIGN = 1;
    private static final int SUBTRACT_SIGN = -1;
    private static final String COLUMN_SEPARATOR = " ";
    private static final String CHECKOUT_TAG = "Checkout cart";
    private static final String TOTAL_TAG = "Total: ";

    private Map<Item, Integer> shoppingCart = new HashMap<>();
    private int total;

    /**
     * Adds item to cart.
     *
     * @param item     item to be added to the cart.
     * @param quantity quantity of the item to be added to the cart.
     * @return the added quantity to the cart.
     */
    public int addCartItem(Item item, int quantity) {
        updateTotal(item, quantity, ADDITION_SIGN);
        if (!shoppingCart.containsKey(item)) {
            shoppingCart.put(item, quantity);
            return quantity;
        }

        int existingQuantity = shoppingCart.get(item);
        int updatedQuantity = existingQuantity + quantity;
        shoppingCart.put(item, updatedQuantity);
        return quantity;
    }

    private void updateTotal(Item item, int quantity, int sign) {
        total += quantity * item.getPrice() * sign;
    }

    public int removeItem(Item item, int quantity) {
        if (!shoppingCart.containsKey(item)) {
            System.err.println("Item not in the cart");
            System.out.println(shoppingCart);
            return 0;
        }

        int existingQuantity = shoppingCart.get(item);
        int updatedQuantity = existingQuantity - quantity;
        if (updatedQuantity > 0) {
            shoppingCart.put(item, updatedQuantity);
            updateTotal(item, quantity, SUBTRACT_SIGN);
            return quantity;
        }
        shoppingCart.put(item, 0);
        updateTotal(item, existingQuantity, SUBTRACT_SIGN);
        return existingQuantity;
    }

    public Map<Item, Integer> removeAll() {

        Map <Item, Integer> snapshotCart = new HashMap<>(shoppingCart);
        shoppingCart = new HashMap<>();     // Garbage collector in action
        // shoppingCart.clear();            // Reuse existing map
        total = 0;
        return snapshotCart;
    }

    public String checkout() {
        final StringBuilder checkout = getCheckoutDetails();
        //writeToFile(checkout.toString());
        removeAll();
        return checkout.toString();
    }

    public void printCheckoutToFile() throws IOException {


        final String checkoutString = getCheckoutDetails().toString();
        final BufferedWriter writer = new BufferedWriter(
                new FileWriter("print checkout.txt"));
        writer.write(checkoutString);
        writer.flush();
        writer.close();

    }

    private StringBuilder getCheckoutDetailsWithStreams() {
        final StringBuilder checkout = getCheckoutHeader();
        final String lineDetails = shoppingCart.entrySet().stream()
                .filter(entry -> entry.getValue() != 0)
                .map(this::getCheckOutLineDetails)
                .collect(Collectors.joining(System.lineSeparator()));
        checkout.append(lineDetails);
        return checkout;
    }

    private StringBuilder getCheckoutDetails() {
        final StringBuilder checkout = getCheckoutHeader();
        for (final Map.Entry<Item, Integer> entry : shoppingCart.entrySet()) {
            final StringBuilder currentLine = getCheckOutLineDetails(entry);
            checkout.append(currentLine).append(System.lineSeparator());
            // Predicate<Item> predicate = (item) -> item.getPrice() > 0;
            Predicate<Item> predicate = new Predicate<Item>() {
                @Override
                public boolean test(Item item) {
                    return false;
                }
            };

        }
        checkout.append(TOTAL_TAG).append(total).append(System.lineSeparator());
        return checkout;
    }

    private StringBuilder getCheckOutLineDetails(Map.Entry<Item, Integer> entry) {
        final StringBuilder currentLine = new StringBuilder();

        final Item currentItem = entry.getKey();
        final int price = currentItem.getPrice();
        currentLine.append(currentItem.getName()).append(COLUMN_SEPARATOR);
        currentLine.append(price).append(COLUMN_SEPARATOR);

        final int currentQuantity = entry.getValue();
        currentLine.append(currentQuantity).append(COLUMN_SEPARATOR);
        currentLine.append(currentQuantity * price).append(COLUMN_SEPARATOR);
        return currentLine;
    }

    private StringBuilder getCheckoutHeader() {
        return new StringBuilder(CHECKOUT_TAG)
                .append(System.lineSeparator());
    }
}
