package Lab03;

public class Dacia extends Masina {
    public Dacia(String culoare,int nrRoti, String proprietar ){
        super(culoare, nrRoti, proprietar);
    }

    @Override
    public void claxoneaza() {
        System.out.println("Claxonez ca lachetul din Dacia");
    }

}
