package aula_05;

import java.util.Scanner;

public class Matrizes {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		double[][] matrizDouble = new double[3][3];

		int[][] matrizIrregular = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "]" + matriz[i][j]);
			}

		}
		System.out.println("\n");
		for (int i = 0; i < matrizDouble.length; i++) {
			for (int j = 0; j < matrizDouble.length; j++) {
				System.out.println("Insira os dados da Matriz[" + i + "][" + j + "] = ");
				matrizDouble[i][j] = sc.nextDouble();
			}

		}
		for (int i = 0; i < matrizDouble.length; i++) {
			for (int j = 0; j < matrizDouble.length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "]" + matrizDouble[i][j]);
			}

		}
		for (int i = 0; i < matrizIrregular.length; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "]" + matrizIrregular[i][j]);
			}

		}

		System.out.println("\n");
		// Transforma a Matriz em um vetor, e printa os elementos do vetor
		for (int[] vetor : matrizIrregular) {
			for (int elementos : vetor) {
				if (elementos % 2 == 0) {
					System.out.println(elementos);
				}
			}
		}

	}
}
