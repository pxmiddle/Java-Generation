package aula_07;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num1, num2, opcao;

		while (true) {

			System.out.println("1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n0- Sair");
			System.out.println("Escolha a operação que você deseja realizar: ");
			opcao = sc.nextInt();

			if (opcao == 0) {
				sobre();
				System.exit(0);
			}
			System.out.println("Insira o primeiro numero: ");
			num1 = sc.nextInt();

			System.out.println("Insira o segundo numero: ");
			num2 = sc.nextInt();

			switch (opcao) {
			case 1 -> System.out.println("Soma: " + somar(num1, num2));
			case 2 -> System.out.println("Subtração: " + subtrair(num1, num2));
			case 3 -> System.out.println("Multiplicação: " + multiplicar(num1, num2));
			case 4 -> System.out.println("Divisão: " + dividir(num1, num2));
			default -> System.out.println("Opção Inválida!");
			}
		}
	}

	static int somar(int num1, int num2) {
		return num1 + num2;
	}

	static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	static void sobre() {
		System.out.println("Calculadora com Métodos");
		System.out.println("Feito por: Pablo");
	}
}
