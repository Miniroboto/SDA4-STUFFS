package Model;

import Shared.Procesor;

public class Laptop extends Item {

    private int memorie;
    private Procesor procesor;

    public Laptop (String name,int price, int memorie, Procesor procesor) {
        super(name);
        this.price= price;
        this.memorie=memorie;
        this.procesor=procesor;
    }

    public int getMemorie() {
        return memorie;
    }

    public Procesor getProcesor() {
        return procesor;
    }
}
