package aula_03;

import java.util.Scanner;

public class Exercicio5 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int codigo, quantidade;
		
		System.out.println("1. Cachorro Quente, unidade: R$ 10,00");
		System.out.println("2. X-Salada, unidade: R$ 15,00");
		System.out.println("3. X-Bancon, unidade: R$ 18,00");
		System.out.println("4. Bauru, unidade: R$ 12,00");
		System.out.println("5. Refrigerante, unidade: R$ 8,00");
		System.out.println("6. Suco de laranja, unidade: R$ 13,00");
		
		System.out.println("Insira o código do produto: ");
		codigo = leia.nextInt();
		
		System.out.println("Insira a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			double valorTotal = quantidade * 10;
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("Produto: X-Banco");
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("Produto: Suco de Laranja");
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		default:
			System.out.println("Código inválido");
		}
		}
	
	}
