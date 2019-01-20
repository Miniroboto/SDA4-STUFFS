import BusinessLogic.Stock;
import Model.Frigider;
import Model.Item;
import Model.Laptop;
import Shared.Consum;
import Shared.OutOfStockException;
import Shared.Procesor;

public class Main {

    public static void main(String[] args)throws Exception{
        final Stock stock = new Stock();
        final Item laptop1 = new Laptop("Asus", 2000, 16, Procesor.AMD);
        Laptop laptop2 = new Laptop("Lenovo", 5000, 32, Procesor.INTEL);
        final  Item laptopHp = new Laptop("HP", 3000, 16, Procesor.INTEL);
        Frigider frigider = new Frigider("Arctic", 999, 300, Consum.APP);
        stock.addSupply(laptop1, 150);
        stock.addSupply(laptop2, 30);
        stock.addSupply(frigider, 10);

        try {
            System.out.println(stock.consumeSupply(laptopHp, 3));

            int rezervate1 = stock.consumeSupply(laptop1, 90);
            System.out.println("laptop 1 " + rezervate1);

            int rezervate2 = stock.consumeSupply(laptop2, 20);
            System.out.println("laptop 2 " + rezervate2);

            System.out.println(stock.consumeSupply(laptop2, 15));
            System.out.println(stock.consumeSupply(laptop2, 15));
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
        }


    }

