package Lab01;

import java.util.Scanner;

public class Spanzuratoare {
    public static void main(String[] args) {
        String cuvant = "coropcar";
        StringBuilder ghici= new StringBuilder();
        int counter=0;
        System.out.println(" Cuvantul de ghicit este ");

        for (int i=0; i<cuvant.length(); i++) {
            ghici.append("_");


        }

        System.out.println();

        Scanner in= new Scanner(System.in);


        while (!cuvant.equals(ghici.toString())){

            System.out.println(ghici);
            System.out.println("Introduceti litera: ");
            char c = in.next().charAt(0);

            for (int i=0; i<cuvant.length(); i++){
                if (cuvant.charAt(i)==c) {
                    ghici.setCharAt(i,c);
                }
            }

            counter++;

        }
        System.out.println( cuvant);
        System.out.println("Ati terminat jocul din " + counter + "incercari");

    }
/*public String guessWhat (String cuvant){


}*/


    }


