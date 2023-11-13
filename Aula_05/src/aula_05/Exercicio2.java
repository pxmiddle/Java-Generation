package aula_05;

import java.util.Scanner;

public class Exercicio2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int soma = 0;
		double media;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o numero: ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}

		System.out.println("Elementos nos índices ímpares:");
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}

		}
		System.out.println("\nElementos nos índices pares:");
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}

		}
		System.out.println("\nsoma: " + soma);
		media = (((double) (soma)) / (vetor.length));
		System.out.printf("a média é: %.2f", media);
	}

}
