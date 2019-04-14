import BusinessLogic.Cart;
import BusinessLogic.CartController;
import BusinessLogic.Client;
import BusinessLogic.Stock;
import Model.Frigider;
import Model.Item;
import Model.Laptop;
import Model.SearchResult;
import Shared.Consum;
import Shared.Procesor;

import java.util.List;

public class Main {

    public static void main(String[] args)throws Exception{
        final Stock stock = new Stock();
        final Item laptop1 = new Laptop("Asus", 2000, 16, Procesor.AMD);
        Laptop laptop2 = new Laptop("Lenovo", 5000, 32, Procesor.INTEL);
        final  Item laptopHp = new Laptop("HP", 3000, 16, Procesor.INTEL);
        Frigider frigider = new Frigider("Arctic", 999, 300, Consum.APP);

//        stock.addSupply(laptop1, 100000);
//        final Thread client1 = new Thread(new Client(stock, laptop1));
//        final Thread client2 = new Thread(new Client(stock, laptop1));
//        client1.start();
//        client2.start();


        stock.addSupply(laptop1, 150);
        stock.addSupply(laptop2, 30);
        stock.addSupply(frigider, 10);

//        try {
//            System.out.println(stock.consumeSupply(laptopHp, 3));

//            int rezervate1 = stock.consumeSupply(laptop1, 90);
//            System.out.println("laptop 1 " + rezervate1);
//
//            int rezervate2 = stock.consumeSupply(laptop2, 20);
//            System.out.println("laptop 2 " + rezervate2);

//            System.out.println(stock.consumeSupply(laptop2, 15));
//            System.out.println(stock.consumeSupply(laptop2, 15));
//
//
//
//        } catch (OutOfStockException e) {
//            System.out.println(e.getMessage());
//        }
//
        final Cart cart = new Cart();
        cart.addCartItem(laptop1, 3);
        cart.addCartItem(frigider,2);
        cart.printCheckoutToFile();
        System.out.println(cart.checkout());
        stock.saveState();
        System.out.println("Saved state: " + stock.getStockList());
        stock.consumeSupply(laptop1,5);
        System.out.println("Changed state: " + stock.getStockList());
        stock.loadState();
        System.out.println("Restored state: " + stock.getStockList());


        Client client3 = new Client(stock, laptop1);
        String searchName = laptop1.getName().substring(2);
        List<SearchResult> searchResults = client3.search(searchName);
        SearchResult searchResult = searchResults.get(0);
        System.out.println(searchResult.getItem().getName() + " - " + searchResult.getItem().getPrice() + " - " + searchResult.getQuantity());


        CartController cartController = new CartController(stock, cart);

        cartController.userAdd(laptop1, 3);





        }


    }

