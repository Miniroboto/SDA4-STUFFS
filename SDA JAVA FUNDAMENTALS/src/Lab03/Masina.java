package Lab03;

public class Masina {
    protected String culoare;
    protected int nrRoti;
    protected String proprietar;

    public Masina (){
        this.culoare= "Neagra";
        this.nrRoti=4;
        this.proprietar="Mr.Bean";
    }

    public Masina(String culoare, int nrRoti, String proprietar){
        this.culoare=culoare;
        this.nrRoti=nrRoti;
        this.proprietar=proprietar;

    }
    public void franeaza (){
        System.out.println("Franez din Masina!");
    }
    public void parcheaza (){
        System.out.println("Parchez din Masina!");
    }
    public void claxoneaza () {
        System.out.println("Claxonez din Masina");
    }
    @Override
    public String toString(){
        return "Salut! sunt o masina si am culoarea "
                + this.culoare + " dar am si " + this.nrRoti + " roti. Proprietarul meu este " +this.proprietar;
    }

}
