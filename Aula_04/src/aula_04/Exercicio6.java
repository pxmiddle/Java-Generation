package aula_04;

import java.util.Scanner;

public class Exercicio6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 1;
		float total = 0.0f, media = 0.0f, i = 0.0f;

		do {
			System.out.println("Insira o número: ");
			num = sc.nextInt();

			total += num;
			i++;
		} while (num != 0);
		media = total / i;
		System.out.println("media: " + media);
	}

}
