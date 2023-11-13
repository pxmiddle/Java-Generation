package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Aline", "Vinicius", "Antonio", "Vitor", "Samara" };

		float[] notas = new float[5];

		for (int i = 0; i < 6; i++) {
			System.out.println("Posição: " + (i + 1) + " = " + pessoas[i]);
		}

		System.out.println("\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para a posição[" + i + "] = ");
			notas[i] = sc.nextFloat();

		}
		System.out.println("\n");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição: " + (i + 1) + " = " + notas[i]);

		}

		Arrays.sort(pessoas);

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Posição [" + i + "] = " + pessoas[i]);
		}

		System.out.println("\n");
		for (int i = pessoas.length - 1; i >= 0; i--) {
			System.out.println("Posição [" + i + "] = " + pessoas[i]);
		}
		System.out.println("\n");
		System.out.println(Arrays.binarySearch(pessoas, "Aline")); // retorna o valor do indice pelo elemento
		System.out.println("\n");

		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
