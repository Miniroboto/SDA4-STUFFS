package Lab01;

import java.util.Scanner;

public class MatrixDiags {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");

            }
            System.out.println();

        for (int i=0; i< matrix.length; i++) {
            System.out.print(matrix [i][matrix.length-1-i] +" ");
        }
        }



    }


