package aula_02;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner leia = new Scanner(System.in);

	
	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: %.2f", novoSalario);
		
	}

}
