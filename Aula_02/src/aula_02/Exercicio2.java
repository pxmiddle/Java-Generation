package aula_02;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		float media = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.printf("A média final é: %.1f", media);
	}

}
