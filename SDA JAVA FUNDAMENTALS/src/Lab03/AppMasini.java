package Lab03;

public class AppMasini {
    public static void main(String[] args) {
        Masina[] masini = new Masina[3];

        masini[0]= new BMW();
        masini [1] = new Dacia("verde", 8, "Johannis");
        masini [2] = new VW();

        for (Masina m : masini) {
            m.franeaza();
            m.parcheaza();
            m.claxoneaza();
            System.out.println(m);
        }
    }
}
