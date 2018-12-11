package Lab01;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[][] matrix = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println(max);

        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                System.out.print(matrix[matrix.length - 1 - i][matrix.length - 1 - j] + " ");


            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                System.out.print(matrix[matrix.length - 1 - j][i] + " ");


            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                System.out.print(matrix[j][matrix.length - 1 - i] + " ");


            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                System.out.print(matrix[matrix.length - 1 - i][j] + " ");


            }
            System.out.println();
        }

        System.out.println();

        System.out.println();
//Afisare sub diagonala primara

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i >= j) {

                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }


            }
            System.out.println(" ");
        }
        System.out.println();
//Afisare sub diagonala secundara
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j > 1) {

                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }


            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i != j) {
                    if (matrix[i][j] != matrix[j][i]) {

                        System.out.print("Nope ");
                        return;
                    }

                }

            }

        }
        System.out.println("Okidoki!");
    }
}


