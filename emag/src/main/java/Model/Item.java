package Model;

public abstract class Item {
    private String name;
    int price = 0;

    public Item(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
