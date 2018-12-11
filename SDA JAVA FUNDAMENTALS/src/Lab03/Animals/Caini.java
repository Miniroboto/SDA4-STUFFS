package Lab03.Animals;

public class Caini extends Mamifer{
    protected String coada;
    protected String stapan;

    public Caini(String culoare, String nume, int nrPicioare, int varsta, int inaltime, int greutate, String sange, String coada, String stapan) {
        super(culoare,nume, nrPicioare, varsta, inaltime, greutate, sange);
        this.coada = coada;
        this.stapan = stapan;
        super.setCuloare(culoare);
    }

    public String getCoada() {
        return coada;
    }

    public void setCoada(String coada) {
        this.coada = coada;
    }

    public String getStapan() {
        return stapan;
    }

    public void setStapan(String stapan) {
        this.stapan = stapan;
    }

    public void gudura() {
        System.out.println("Cutulache se gudura pe langa " + this.stapan);
    }
}
