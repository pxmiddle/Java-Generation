package aula_03;

import java.util.Scanner;

public class Exercicio8 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int codigo;
		float saldo = 1000.00F, valor;
		
		System.out.println("1. Saldo\n2. Saque\n3. Depósito");
		System.out.println("Insira o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.printf("Operação - Saldo\nSaldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("Insira o valor do saque: ");
			valor = leia.nextFloat();
			saldo = saldo - valor;
			if(saldo < 0) {
				System.out.println("Saldo Insuficiente!");
			}
			else {
				System.out.printf("Novo saldo: R$ %.2f", saldo);
			}
			break;
		case 3:
			System.out.println("Insira o valor do depósito: ");
			valor = leia.nextFloat();
			saldo = saldo + valor;
			System.out.printf("Novo saldo: R$ %.2f", saldo);
			break;
		default:
			System.out.println("Operação Inválida");
		}
		

	}

}
