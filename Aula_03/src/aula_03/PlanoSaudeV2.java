package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int faixaIdade;
		String nome;
		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();

		System.out.println("Faixas etárias: ");
		System.out.println("1. De 0 a 10 anos");
		System.out.println("2. De 11 a 29 anos");
		System.out.println("3. De 30 a 45 anos");
		System.out.println("4. De 46 a 59 anos");
		System.out.println("5. De 60 a 65 anos");
		System.out.println("6. Acima de 65 anos");

		System.out.print("\nDigite a faixa etária: ");
		faixaIdade = leia.nextInt();

		switch (faixaIdade) {
		case 1:
			System.out.printf("\nO valor do plano do %s é de: R$ 100,00", nome);
			break;
		case 2:
			System.out.printf("\nO valor do plano do %s é de: R$ 200,00", nome);
			break;
		case 3:
			System.out.printf("\nO valor do plano do %s é de: R$ 300,00", nome);
			break;
		case 4:
			System.out.printf("\nO valor do plano do %s é de: R$ 500,00", nome);
			break;
		case 5:
			System.out.printf("\nO valor do plano do %s é de: R$ 600,00", nome);
			break;
		case 6:
			System.out.printf("\nO valor do plano do %s é de: R$ 1000,00", nome);
			break;
		default:
			System.out.println("\nSelecione uma faixa etária válida");
		}
		

	}


}
