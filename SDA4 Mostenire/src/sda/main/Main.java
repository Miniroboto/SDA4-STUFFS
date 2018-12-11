package sda.main;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Sportiv> listasportivi = new LinkedList<>();

        Fotbalist fotbalist1 = new Fotbalist(180, 75, "Bumbescu", 45.5f,"atacant", 3000 );
        listasportivi.add(fotbalist1);
        Voleibalist voleibalist1 = new Voleibalist(200, 85,"Ion" , "pivot",35.5f, 3700, 300.5f, "VC Vaslui" );
        listasportivi.add(voleibalist1);

        for (int i=0; i<listasportivi.size();i++){
            Sportiv aux = listasportivi.get(i);
            if (aux instanceof Fotbalist){
                System.out.println("Elementul " +i + " este Fotbalist");
            }
            else if (aux instanceof Voleibalist) {
                System.out.println("Elementul " +i + " este Voleibalist");
            }
        }

    }
}
