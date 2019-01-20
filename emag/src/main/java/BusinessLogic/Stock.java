package BusinessLogic;

import Model.Item;
import Shared.OutOfStockException;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private static final int MAX_QUANTITY = 100;
    private Map<Item, Integer > stockSupply = new HashMap<>();

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


}
