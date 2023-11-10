package aula_04;

import java.util.Scanner;

public class Pesquisa {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, esporte, futebol = 0, voleiMai18 = 0, basqueteMen18 = 0, outros = 0;
		String decisao = "S";

		while (decisao.equalsIgnoreCase("S")) {

			System.out.println("Digite a sua idade:");
			idade = sc.nextInt();
			do {
				System.out.println("Digite o seu esporte favorito\n1. Futebol\n2. Volei\n3. Basquete\n4. Outros: ");
				esporte = sc.nextInt();
				
				if(esporte < 1 || esporte > 4) {
					System.out.println("Digite um valor entre 1 a 4");
				}

			} while (esporte < 1 || esporte > 4);
			// Quantas pessoas gostam de futebol
			if (esporte == 1) {
				futebol++;
			}

			// Quantas pessoas gostam de volei e são maiores de 18
			if (esporte == 2 && idade > 18) {
				voleiMai18++;
			}

			// Quantas pessoas gostam de basquete e são menores de 18
			if (esporte == 3 && idade < 18) {
				basqueteMen18++;
			}

			// Quantas pessoas gostam de outros esportes
			if (esporte == 4) {
				outros++;
			}

			System.out.println("Deseja continuar S/N? ");
			sc.skip("\\R");
			decisao = sc.nextLine().toUpperCase();

		}
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de volei e são maiores de 18 anos: " + voleiMai18);
		System.out.println("Total de pessoas que gostam de basquete e são menores de 18 anos: " + basqueteMen18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);

	}

}
