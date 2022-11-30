/*
KOMMENTARE FEHLEN!!!



*/


package Code;

import java.util.Arrays;

public class Matrizen {
	
	static int det(int[][] mat) {
		return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
	}
	
	static void printMat(int[][] mat) {
		for (int y = 0; y < mat.length; y++) {
			System.out.print("|\t");
			for (int x = 0; x < mat[y].length; x++) {
				System.out.print(mat[y][x] + "\t");
			}
			System.out.println("|");
		}
	}
	
	static int[][] copy(int[][] arr) {
		int[][] out = new int[arr.length][];
		
		for (int y = 0; y < arr.length; y++) {
			out[y] = arr[y].clone();
		}
		
	    return out;
	}
	
	static double getNSolution(int[][] koeffizientenmatrix, int[] ergebnisvektor, int n) {
		int[][] mata = copy(koeffizientenmatrix);
		for (int y = 0; y < mata.length; y++) {
			mata[y][n] = ergebnisvektor[y];
		}
		
		if (det(koeffizientenmatrix) == 0) {
			return Integer.MAX_VALUE;
		}
		
		return det(mata) / (double) det(koeffizientenmatrix); 
	}
	
	
	static int[][] matAdd(int[][] mata, int[][] matb) {
		int[][] out = new int[mata.length][mata[0].length];
		for (int y = 0; y < mata.length; y++) {
			for (int x = 0; x < mata[0].length; x++) {
				out[y][x] = mata[y][x] + matb[y][x];
			}
		}
		return out;
	}

	public static void main(String[] args) {
		int[][] matrix = {{-2, 4}, {7, -4}}; // YX-Addressing
		//System.out.println(det(matrix));
		printMat(matrix);
		
		int[][] koeffizintenmatrix = {{2, -3},
									  {-1, 5}};
		int[] ergebnisvektor = {5, -1};
		
		System.out.println(":" + getNSolution(koeffizintenmatrix, ergebnisvektor, 0));
		System.out.println(":" + getNSolution(koeffizintenmatrix, ergebnisvektor, 1));

	}

}
