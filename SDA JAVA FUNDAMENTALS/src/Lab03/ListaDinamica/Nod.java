package Lab03.ListaDinamica;

public class Nod {

    private String val;
    private Nod urmator;

    public Nod(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Nod getUrmator() {
        return urmator;
    }

    public void setUrmator(Nod urmator) {
        this.urmator = urmator;
    }
}
