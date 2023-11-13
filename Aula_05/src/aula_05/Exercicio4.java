package aula_05;

import java.util.Scanner;

public class Exercicio4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] notas = new double[2][4];
		double vetorMedia[] = new double[2];
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
			 vetorMedia[i] = soma/notas[i].length;
			 soma = 0.0f;
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("\nMédia dos participantes " + (i +1) + ": " + vetorMedia[i]);
		}
	}
	}

