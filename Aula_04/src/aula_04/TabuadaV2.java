package aula_04;

import java.util.Scanner;

public class TabuadaV2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, cont = 1;

		System.out.println("Digite um numero:");
		numero = sc.nextInt();

		while (cont <= 10) {
			System.out.println(numero + " x " + cont + " = " + (numero * cont));
			cont++;
		}
	}

}
