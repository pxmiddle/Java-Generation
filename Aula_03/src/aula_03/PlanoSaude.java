package aula_03;

import java.util.Scanner;

public class PlanoSaude {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade;
		String nome;

		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.print("\nDigite a sua idade: ");
		idade = leia.nextInt();

		if (idade > 0) {
			if (idade <= 10) {
				System.out.printf("\nO valor do plano do %s é de: R$ 100,00", nome);
			} else if (idade >= 11 && idade <= 29) {
				System.out.printf("\nO valor do plano do %s é de: R$ 200,00", nome);
			} else if (idade >= 30 && idade <= 45) {
				System.out.printf("\nO valor do plano do %s é de: R$ 300,00", nome);
			} else if (idade >= 46 && idade <= 59) {
				System.out.printf("\nO valor do plano do %s é de: R$ 500,00", nome);
			} else if (idade >= 60 && idade <= 65) {
				System.out.printf("\nO valor do plano do %s é de: R$ 600,00", nome);
			} else {
				System.out.printf("\nO valor do plano do %s é de: R$ 1000,00", nome);

			}
		} else {
			System.out.println("Idade invalida.");
		}

	}

}
