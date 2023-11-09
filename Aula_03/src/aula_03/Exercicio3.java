package aula_03;

import java.util.Scanner;

public class Exercicio3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nomeDoador;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do Doador: ");
		nomeDoador = leia.nextLine();
		
		System.out.println("Digite a idade do Doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira Doação? ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if (idade >=60 && idade <= 69 && primeiraDoacao == true) {
				System.out.printf("%s não está apto a doar sangue!",nomeDoador);
			}
			else if(idade >=60 && idade <= 69 && primeiraDoacao == false) {
				System.out.printf("%s está apto a doar sangue!",nomeDoador);
			}
			else {
				System.out.printf("%s está apto a doar sangue!", nomeDoador);
			}
		}
		else {
			System.out.printf("%s não está apto a doar sangue!",nomeDoador);

		}
		
	}
}
