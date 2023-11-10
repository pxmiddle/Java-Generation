package aula_04;

import java.util.Scanner;

public class Exercicio3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade = 0, idadeMen = 0, idadeMai = 0;

		while (idade > -1) {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();

			if (idade < 21 && idade > 0) {
				idadeMen++;
			}
			if (idade > 50) {
				idadeMai++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + idadeMen);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMai);

	}

}
