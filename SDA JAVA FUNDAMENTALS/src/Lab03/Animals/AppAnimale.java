package Lab03.Animals;

import Lab03.Animals.Caini;
import Lab03.Animals.Mamifer;

public class AppAnimale {

    public static void main(String[] args) {
        Mamifer costel = new Mamifer("maro", "Costel", 5, 34, 150, 60, "cald");

        costel.doarme();
        costel.naste();
        costel.setGreutate(800);
        System.out.println("Greutatea lui " + costel.getNume() + " este " + costel.getGreutate());

        Caini combo = new Caini("maro", "Titel", 3, 2, 50, 10, "cald", "verde", "Alex");
        ANIMAL maimut = new ANIMAL("maro", "Maradona", 4, 23);




        combo.gudura();
        System.out.println(combo.getNume() + " are picioare in numar de " + combo.getNrPicioare() );



    }



}
