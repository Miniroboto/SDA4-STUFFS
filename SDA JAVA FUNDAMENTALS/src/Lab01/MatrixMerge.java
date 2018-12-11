package Lab01;

import java.util.Scanner;

public class MatrixMerge {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Introduceti numarul de linii: ");
        int n= in.nextInt();
        System.out.println("Introduceti numarul de coloane: ");
        int m= in.nextInt();

        int[][] MatrixOne = new int[n][m];
        int[][] MatrixTwo = new int[n][m];
        int[][] MatrixThree = new int[n][m];


        System.out.println("Introduceti numerele in MatrixOne ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduceti numarul matrix [ " + i +" ][ " + j + "]");
                MatrixOne[i][j]=in.nextInt();

            }
            System.out.println();}

        System.out.println("Introduceti numerele in MatrixTwo ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduceti numarul matrix [ " + i +" ][ " + j + "]");
                MatrixTwo[i][j]=in.nextInt();

            }
            System.out.println();}

        System.out.println("MatrixThree este ");

        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                MatrixThree[i][j]=MatrixOne[i][j] + MatrixTwo[i][j];
                                System.out.print(MatrixThree[i][j]  + " ");


            }
            System.out.println();}





    }
}
