package InstrumenteDeScris;

public class Creion extends InstrumenteDeScris {

    private String clasa;

    public Creion(Integer serie, Float pret, String culoare, String clasa) {
        super(serie, pret, culoare);
        this.clasa = clasa;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }
}
