package aula_03;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b, c, resultado;
		
		System.out.println("Insira o numero A: ");
		a=leia.nextInt();
		System.out.println("Insira o numero B: ");
		b=leia.nextInt();
		System.out.println("Insira o numero C: ");
		c=leia.nextInt();
		
		if(a+b > c) {
			resultado = a+b;
			System.out.printf("%d + %d = %d > %d " , b, a, resultado, c);
			System.out.println(" A Soma de A + B é Maior do que C");
		}
		if(a+b < c) {
			resultado = a+b;
			System.out.printf("%d + %d = %d < %d " , b, a, resultado, c);
			System.out.println(" A Soma de A + B é Menor do que C");
		}
		if(a+b == c) {
			resultado = a+b;
			System.out.printf("%d + %d = %d = %d " , b, a, resultado, c);
			System.out.println(" A Soma de A + B é Igual do que C");
		}
	}

}
