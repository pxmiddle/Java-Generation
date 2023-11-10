package aula_04;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			num = sc.nextInt();
			if (num % 2 == 0) {
				par++;

			} else {
				impar++;
			}
		}
		System.out.println("Total de numeros pares: " + par);
		System.out.println("Total de numeros impares: " + impar);
	}

}
