package aula_04;

import java.util.Scanner;

public class Tabuada {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um numero:");
		numero = sc.nextInt();
		
		for(int cont = 1; cont <= 10; cont++) {
			System.out.println(numero + " x " + cont + " = " + (numero * cont));
		}

	}

}
