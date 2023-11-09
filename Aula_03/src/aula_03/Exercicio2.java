package aula_03;

import java.util.Scanner;

public class Exercicio2 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Insira o numero: ");
		numero = leia.nextInt();
		
		if(numero < 0 && numero%2 ==0) {
			System.out.printf("O número %d é par e negativo!", numero);
		}
		else if(numero > 0 && numero%2 ==0) {
			System.out.printf("O número %d é par e positivo!",numero);
		}
		else if(numero < 0 && numero%1 ==0) {
			System.out.printf("O número %d é impar e negativo!", numero);
		}
		else if(numero > 0 && numero%1 ==0) {
			System.out.printf("O número %d é impar e positivo!", numero);
		}
	}

}
