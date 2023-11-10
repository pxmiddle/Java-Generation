package aula_04;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, genero, genCont = 0, genIdadeCont = 0, genBin30 = 0, dev, devCont = 0, total = 0;
		String escolha = "S";
		float media = 1.0f, totalIdade = 0.0f;

		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("Insira sua idade: ");
			idade = sc.nextInt();

			System.out.println("Identidade de Gênero (Número Inteiro):");
			System.out.println(
					"1 – Mulher Cis\n2 – Homem Cis\n3 – Não Binário\r\n4 – Mulher Trans\n5 – Homem Trans\n6 – Outros\n");
			genero = sc.nextInt();

			System.out.println("Pessoa Desenvolvedora (Número Inteiro):");
			System.out.println("1 – Backend\n2 – Frontend\n3 – Mobile\n4 – FullStack\n");
			dev = sc.nextInt();
			if (dev == 1) {
				devCont++;
			}
			// Total de Mulheres Cis e Trans desenvolvedoras Frontend:
			if ((genero == 1 || genero == 4) && (dev == 2)) {
				genCont++;
			}

			// Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos:
			if (idade > 40 && (genero == 2 || genero == 5)) {
				genIdadeCont++;
			}

			// Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos:
			if ((genero == 3 && idade < 30 && dev == 4)) {
				genBin30++;
			}

			total++;
			totalIdade += idade;
			System.out.println("Deseja Continuar? (S/N)");
			escolha = sc.next();

		}
		media = totalIdade / total;

		System.out.println("Total de pessoas desenvolvedoras Backend: " + devCont);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + genCont);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + genIdadeCont);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + genBin30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", media);

	}

}
