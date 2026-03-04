package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// Criando matriz [][]
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			// Outro for para percorrer as COLUNAS
			for(int j = 0; j <  mat[i].length; j++) {
				// [linha][coluna]
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int negativo = 0;
		for(int i = 0; i < mat.length; i++) {
			// mat[i].length = pega a linha correspondente
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					negativo++;
				}
			}
		}
		System.out.println("Negative numbers = " + negativo);
		
		sc.close();

	}

}
