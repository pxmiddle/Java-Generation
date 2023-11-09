package aula_03;

import java.util.Scanner;

public class Exercicio7 {
	static Scanner leia = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		int codigo;
		float numero1, numero2, total;
		
		
		System.out.println("Digite o numero1: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o numero2: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Insira o código da operação: ");
		codigo= leia.nextInt();
		
		switch(codigo) {
		case 1:
			total = numero1 + numero2;
			System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, total);
			break;
		case 2:
			total = numero1 - numero2;
			System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, total);
			break;
		case 3:
			total = numero1 * numero2;
			System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, total);
			break;
		case 4:
			total = numero1 / numero2;
			System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, total);
			break;
		default: 
			System.out.println("Código inválido");
		}
		
			
		
		
		
	}

}
