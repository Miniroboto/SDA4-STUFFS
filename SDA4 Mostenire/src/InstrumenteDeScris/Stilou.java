package InstrumenteDeScris;

public class Stilou extends InstrumenteDeScris {
    private String materialPenita;

    public Stilou(Integer serie, Float pret, String culoare, String materialPenita) {
        super(serie, pret, culoare);
        this.materialPenita = materialPenita;
    }

    public String getMaterialPenita() {
        return materialPenita;
    }

    public void setMaterialPenita(String materialPenita) {
        this.materialPenita = materialPenita;
    }
    @Override
    public String toString()
    {
        return "[Stilou//" +super.toString()+
                " material pentita: " +materialPenita +
                "]";

    }
    @Override
    public boolean equals (Object obj){
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Stilou)){
            return false;
        }
        Stilou celalaltStilou = (Stilou) obj;
        if (!celalaltStilou.materialPenita.equals(materialPenita)){
            return false;
        }
        if (!celalaltStilou.serie.equals(serie)) {
            return false;
        }
        if (!celalaltStilou.pret.equals(pret)) {
            return false;
        }
        if (!celalaltStilou.culoare.equals(culoare)){
            return false;
        }
        return true;
    }

}
