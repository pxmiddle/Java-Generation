package aula_02;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		double numero1, numero2;

		System.out.println("Insira o primeiro número: ");
		numero1 = leia.nextDouble();

		System.out.println("Insira o segundo número: ");
		numero2 = leia.nextDouble();

		System.out.println("Soma: " + (numero1 + numero2));
		System.out.println("Subtração: " + (numero1 - numero2));
		System.out.println("Multiplicação: " + (numero1 * numero2));
		if (numero2 > 0) {
			System.out.println("Divisão: " + (numero1 / numero2));
			System.out.println("A divisão funcionou!");
		}
		else {
			System.out.println("Não existe divisão por zero.");
		}
		System.out.println("Modulo do numero1: " + (numero1 % 2));
		System.out.println("Modulo do numero2: " + (numero2 % 2));

		System.out.println("Raiz quadrada do numero1: " + (Math.sqrt(numero1)));

		System.out.println("Potenciação do numero1 pelo numero 2: " + (Math.pow(numero1, numero2)));

	}

}
