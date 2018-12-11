package Lab02;

import java.util.Arrays;

public class SirIntRepetari {
    public static void main(String[] args) {
        int[] sir = {6, 5, 8, 6, 5, 3, 6, 5, 10};
        int contor = 0;
        Arrays.sort(sir);
        System.out.println(Arrays.toString(sir));

       for (int i = 0; i < sir.length-1; i++) {
                if (sir[i] == sir[i+1]) {
                    contor++;
                }
           System.out.println("Nr." + sir[i] + " se repeta de " + contor + " ori");
       }

        }
    }



