package Lab01;

import java.util.Scanner;

public class SumInputMetodeArray {
    Scanner in =new Scanner(System.in);
    int[] numere;

    public void citeste(int n) {
        this.numere =new int[n];

        for(int x=0; x<numere.length;x++) {
            System.out.println("Introduceti numarul " +x);
            numere[x] = in.nextInt();
        }
    }
    public int sum(int n) {
        int suma =0;

        for (int x=0;x<numere.length;x++){
            suma+=numere[x];
        }
        return suma;
    }

    public static void main(String[] args) {
        SumInputMetodeArray app = new SumInputMetodeArray();
        System.out.println("Cate numere doriti sa adunati? ");
        int n= app.in.nextInt();
        app.citeste(n);

        System.out.println("Suma celor " + n + " numere este: "  + app.sum(n));

    }
}
