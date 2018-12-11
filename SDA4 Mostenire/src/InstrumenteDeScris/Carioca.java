package InstrumenteDeScris;

public class Carioca extends InstrumenteDeScris{
    private boolean refilable;

    public Carioca(Integer serie, Float pret, String culoare, boolean refilable) {
        super(serie, pret, culoare);
        this.refilable = refilable;
    }

    public boolean getRefilable() {
        return refilable;
    }

    public void setRefilable(boolean refilable){
        this.refilable=refilable;
    }
}
