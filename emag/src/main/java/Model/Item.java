package Model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Item implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
