package Lab02;

import java.util.Arrays; //Bubble sort

public class SirSortat {
    public static void main(String[] args) {
        int[] Sir = {24, 4, 5};



        for (int i = 0; i < Sir.length; i++) {
            for (int j = i+1; j < Sir.length; j++) {
                int tmp = 0;
                if (Sir[i] > Sir[j]) {
                    tmp = Sir[i];
                    Sir[i] = Sir[j];
                    Sir[j] = tmp;

                }


            }
        }
        System.out.print(Arrays.toString(Sir));
    }
}




