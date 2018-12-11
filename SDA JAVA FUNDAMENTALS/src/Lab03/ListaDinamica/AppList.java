package Lab03.ListaDinamica;

import java.util.Scanner;

public class AppList {

    public static void main(String[] args){

        List lista = new List();
        Scanner in = new Scanner(System.in);
        String s = "";

        while(true) {
            System.out.println("Introduceti un nume sau /s pentru a termina de adaugat");
            s = in.nextLine();
            if(s.equalsIgnoreCase("/s")) {
                break;
            }

            lista.add(s);
        }

        parcurgere(lista);

        System.out.println("Introduceti cuvantul de scos din lista: ");
        String scos = in.nextLine();

        lista.remove(scos);

        parcurgere(lista);

    }

    public static void parcurgere(List lista){
        Nod nod = lista.getPrimul();
        int i = 1;
        while(nod != null){
            System.out.println("Elementul " + i + ": " + nod.getVal());
            nod = nod.getUrmator();
            i++;
        }

        System.out.println("Avem in total " + (i-1) + " elemente");
    }
}