package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Whatever {

    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        System.out.println("Introduceti n: ");
        int n= in.nextInt();
        System.out.println("Introduceti m: ");
        int m= in.nextInt();

        int[][] matrix = new int[n][m];




        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduceti numarul matrix [ " + i +" ][ " + j + "]");
                matrix[i][j]=in.nextInt();

            }
            System.out.println();}


                for ( int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[j-2][i] + " ");


            }
                    System.out.println();}
        System.out.println();

        for ( int i = 0; i < matrix.length; i++) {


                    System.out.print(matrix[i][i]);}





        System.out.println();

        for ( int i = 0; i < matrix.length; i++) {

                    System.out.print(matrix[i][matrix.length-i-1]);


            }

        }


    }





