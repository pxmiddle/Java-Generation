package aula_05;

import java.util.Scanner;

public class Exercicio4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] notas = new double[10][4];
		double vetorMedia[] = new double[10];
		double soma = 0;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Insira as notas: ");
				notas[i][j] = sc.nextDouble();
			}
		}

		System.out.println("\n");

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma +=notas[i][j];
			}
			 vetorMedia[i] = soma/4;
		}
		
		System.out.println("Vetor: ");
		for(int i = 0; i < vetorMedia.length; i++)
			System.out.printf("| %.1f ", vetorMedia[i]);
		System.out.println("|");
	}
	}

