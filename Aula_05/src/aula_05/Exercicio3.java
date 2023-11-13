package aula_05;

import java.util.Scanner;

public class Exercicio3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int diagP = 0, diagS = 0, col = 1;
		String diagSS = "";

		System.out.println("\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Insira os dados da Matriz[" + i + "][" + j + "] = ");
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "]" + matriz[i][j]);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					System.out.println(matriz[i][j]);
					diagP += matriz[i][j];
				}
			}
		}
		
		System.out.println("\n");

		for (int i = 0; i < matriz.length; i++) {
			diagSS += matriz[i][matriz.length - 1 - i] + " ";
			diagS +=matriz[i][i];
			}
		System.out.println(diagSS);
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + diagP);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + diagS);
		}

		

	}