package InstrumenteDeScris;

public class InstrumenteDeScris {
    protected Integer serie;
    protected Float pret;
    protected String culoare;

    public InstrumenteDeScris(Integer serie, Float pret, String culoare) {
        this.serie =serie;
        this.pret = pret;
        this.culoare= culoare;

    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Float getPret() {
        return pret;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "{Instrument de Scris //" +
        " serie: "+ serie+
        " pret: " + pret +
                " culoare: " + culoare +"}";
    }
}
