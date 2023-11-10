package aula_04;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2;
		
		System.out.println("Insira o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1< num2) {
			System.out.println("No Intervalo entre 10 e 100:");
			for(int i = num1; i < num2; i++) {
				if (i%3 == 0 && i%5 == 0) {
					System.out.printf("%d é multiplo de 3 e 5\n", i);
				}
			}
			
			
		}
		else {
			System.out.println("Intervalo inválido!");
		}

	}

}
