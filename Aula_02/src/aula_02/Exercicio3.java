package aula_02;

import java.util.Scanner;

public class Exercicio3 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o desconto: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário Liquido: %.2f", salarioLiquido);
		
	}

}
