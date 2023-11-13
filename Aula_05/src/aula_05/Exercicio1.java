package aula_05;

import java.util.Scanner;

public class Exercicio1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int procurar;
		boolean find = false;

		System.out.println("Digite o número que você deseja encontrar: ");
		procurar = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {

			if (procurar == vetor[i]) {
				find = true;
				System.out.printf("O número %d está localizado na posição: %d", procurar, i);
			}
		}
		if(!find) {
			System.out.printf("O número %d não foi encontrado!", procurar);
		}
	}
}
