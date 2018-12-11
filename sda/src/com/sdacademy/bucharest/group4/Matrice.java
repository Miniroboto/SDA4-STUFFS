package com.sdacademy.bucharest.group4;

public class Matrice {

	public static void main(String[] args) {
		int[][] matrice = new int[3][3];

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = i + j;
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

}
