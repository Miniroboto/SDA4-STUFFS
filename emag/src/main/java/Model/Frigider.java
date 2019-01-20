package Model;

import Shared.Consum;

public class Frigider extends Item {

    private int volum;
    private Consum consum;

    public Frigider(String name,int price, int volum, Consum consum) {
        super(name);
        this.price=price;
        this.volum = volum;
        this.consum = consum;
    }
}
