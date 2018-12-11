package Lab03.Animals;

public class Mamifer extends ANIMAL {

    protected int Inaltime;
    protected int Greutate;
    protected String sange= "cald";



    public Mamifer(String culoare, String nume, int nrPicioare, int varsta, int inaltime, int greutate, String sange) {
        super(culoare, nume, nrPicioare, varsta);
       this.Inaltime = inaltime;
       this.Greutate = greutate;
       this.sange=sange;
    }

    public String getSange() {
        return sange;
    }

    public int getInaltime() {
        return Inaltime;
    }

    public void setInaltime(int inaltime) {
        Inaltime = inaltime;
    }

    public int getGreutate() {
        return Greutate;
    }

    public void setGreutate(int greutate) {
        Greutate = greutate;
    }
    public void naste() {
        System.out.println("Mamiferul naste pui vii");
    }

    public void doarme() {
        System.out.println("Mamiferul doarme");
    }



}
