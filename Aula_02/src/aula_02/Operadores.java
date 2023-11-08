package aula_02;

import java.util.Scanner;

public class Operadores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1 = 10, numero2 = 20;
		String valor1 = "2", valor2 = "3";
		String nome = "Pablo";
		int idade= 24;
		float media = 2.456789f;
		int tamanho;
		
		System.out.println("a soma das variáveis numero1 e numero2 é: " + (numero1 + numero2));
		System.out.println("a soma das variáveis valor1 e valor2 é: " + (valor1 + valor2));
		System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos.");
		System.out.printf("A média final é %.2f", media);
		
		System.out.println("\nDigite o tamanho: ");
		tamanho = leia.nextInt();
		
		System.out.println("O valor digitado foi: " + tamanho);
		
	}

}
