package BusinessLogic;

import Model.Item;
import Model.SearchResult;
import Shared.OutOfStockException;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int MAX_QUANTITY = 100000;
    private Map<Item, Integer > stockSupply = new ConcurrentHashMap<>();

    public int getStock(Item item) {
        return stockSupply.containsKey(item) ? 0:stockSupply.get(item);

    }

    public int addSupply (Item item, int quantity) {
        if (!stockSupply.containsKey(item)) {

            if (quantity> MAX_QUANTITY) {
                stockSupply.put(item, MAX_QUANTITY);
                return MAX_QUANTITY;
            }
            stockSupply.put(item, quantity);
            return quantity;
        }
        final int existingQuantity = stockSupply.get(item);
        int updatedQuantity = existingQuantity +quantity;

        if (updatedQuantity> MAX_QUANTITY) {
            updatedQuantity= MAX_QUANTITY;
        }

        stockSupply.put (item, updatedQuantity);
        return  updatedQuantity-existingQuantity;
    }

    public int   consumeSupply (Item item, int quantity) throws OutOfStockException {
        if (!stockSupply.containsKey(item)) {
            throw new OutOfStockException(item.getName() + " is out of stock");
        }
        final int existingQuantity = stockSupply.get(item);
        int updatedQuantity = existingQuantity - quantity;
        if (updatedQuantity < 0) {
        stockSupply.put(item, 0);
        return existingQuantity;
    }
    stockSupply.put(item, updatedQuantity);
        return quantity;

    }
    public List<SearchResult> search(String itemName) {
        // Parcurg toate elementele
        // Selectez elementele care au numele dat
        // Returnez elementele selectate
        Predicate<SearchResult> filterCondition = searchResult ->
                searchResult.getItem().getName().toLowerCase()
                        .matches(".*" + itemName.toLowerCase() + ".*");

        return stockSupply.entrySet().stream()
                .map(entry -> new SearchResult(entry.getKey(), entry.getValue()))
                .filter(filterCondition)
                .collect(Collectors.toList());
    }

    //1. Marcam clasa Stock cu Serializable
    //2. saveState() -: ObjectOutputStream (FileOutputStream)
    //3. write (this)
    public void saveState() throws IOException {
       // final String checkoutString = getCheckoutDetails().toString();

               final ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("Stock.db"));
                outputStream.writeObject(this);


    }

    public void loadState() throws IOException, ClassNotFoundException {


        final ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("Stock.db"));
                Stock loadedStock = (Stock) inputStream.readObject();
                //stockSupply=loadedStock.stockSupply;
                stockSupply.clear();
                stockSupply.putAll(loadedStock.stockSupply);
                inputStream.close();


    }
    public String getStockList () {
        return stockSupply.toString();
    }

}
