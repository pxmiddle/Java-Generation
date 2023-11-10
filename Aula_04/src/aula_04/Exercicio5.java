package aula_04;

import java.util.Scanner;

public class Exercicio5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0, total = 0;
		do {
			System.out.println("Digite um numero: ");
			num = sc.nextInt();
			if(num > 0) {
				total += num;
			}
			
		}while(num !=0);
		System.out.println("A soma dos números positivos é: " + total);
	}

}
