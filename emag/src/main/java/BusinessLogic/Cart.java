package BusinessLogic;

import Model.Item;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Item, Integer> shoppingCart = new HashMap<>();
    private int total;

    /**
     *
     * @param item item to be added ti tge cart
     * @param quantity quantity of the item to be added to the cart
     * @return the added quantity to the cart.
     */

    public int addCartItem (Item item, int quantity) {
        if (!shoppingCart.containsKey(item)) {
            shoppingCart.put(item, quantity);
            updateTotal(item, quantity);
            return quantity;
        }

        int existingQuantity = shoppingCart.get(item);
        int updatedQuantity = existingQuantity + quantity;
        shoppingCart.put(item, updatedQuantity);
        updateTotal(item, quantity);
        return updatedQuantity;

    }

    public void updateTotal(Item item, int quantity) {
        total += quantity * item.getPrice();
    }

    public int removeItem (Item item, int quantity) {
        if(!shoppingCart.containsKey(item)) {
            System.err.println("Item not in the cart!");
            System.out.println(shoppingCart);
            return 0;

        }
            int existingQuantity = shoppingCart.get(item);
            int updatedQuantity = existingQuantity - quantity;

            if (updatedQuantity>0) {
                shoppingCart.put(item, updatedQuantity);
                total-=quantity*item.getPrice();
                return quantity;

            }
            //daca incercam sa eliminam mai multe produsde decat avem pe stoc
            shoppingCart.put((item,0));
            total-=existingQuantity*item.getPrice();
            return existingQuantity;

        }

        public void removeAll () {
        shoppingCart = new HashMap<>(); // Garbage collector in action
       // shoppingCart.clear(); //reuse existing map
            total=0;
        }
    }

