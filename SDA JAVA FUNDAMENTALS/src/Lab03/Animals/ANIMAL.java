package Lab03.Animals;

public class ANIMAL {
    protected String culoare;
    protected String nume;
    protected int nrPicioare;
    protected int varsta;

    public ANIMAL(){}
    public ANIMAL(String culoare, String nume, int nrPicioare, int varsta) {
        this.culoare = culoare;
        this.nume = nume;
        this.nrPicioare = nrPicioare;
        this.varsta = varsta;
    }


    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void mananca() {
        System.out.println("Animalul mananca");
    }

    public void danseaza() {
        System.out.println("Animalul danseaza");
    }

}
