package Lab03.Persoane;

public class Persoana {
    public String nume;
    public String prenume;
    public int varsta;


    public String studii;

    public Persoana(String nm, String prn, int vsa, String std) {
        this.nume = nm;
        this.prenume = prn;
        this.varsta = vsa;
        this.studii = std;
    }


    public void Danseaza() {
        System.out.println("Persoana danseaza! ");
    }

    public void plimba() {
        System.out.println("Persoana se plimba");
    }

    public void setStudii(String studii) {
        this.studii = studii;
    }

    @Override
    public String toString() {
        return "Salut! sunt un om si ma cheama "
                + this.nume + " " + this.prenume + " am varsta " + this.varsta + " si de profesie sunt " + this.studii;


    }
}



