package sda.main;

public class Sportiv {
    protected Integer inaltime;
    protected Integer greutate;
    protected String nume;

    public Sportiv(Integer inaltime, Integer greutate, String nume) {
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.nume = nume;
    }

    public Integer getInaltime() {
        return inaltime;
    }

    public void setInaltime(Integer inaltime) {
        this.inaltime = inaltime;
    }

    public Integer getGreutate() {
        return greutate;
    }

    public void setGreutate(Integer greutate) {
        this.greutate = greutate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
