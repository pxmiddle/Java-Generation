package aula_03;

import java.util.Scanner;

public class Exercicio6 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nomeColaborador;
		int codigoColaborador;
		float salario, novoSalario;
		
		System.out.println("Insira o nome do Colaborador: ");
		nomeColaborador = leia.nextLine();
		
		System.out.println("Insira o código do Colaborador: ");
		codigoColaborador = leia.nextInt();
		
		System.out.println("Insira o salário: ");
		salario = leia.nextFloat();
		
		switch(codigoColaborador) {
		case 1:
			novoSalario = (float) (salario +(0.10 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Gerente\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 2:
			novoSalario = (float) (salario +(0.07 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Vendedor\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 3:
			novoSalario = (float) (salario +(0.09 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Supervisor\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 4:
			novoSalario = (float) (salario +(0.09 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Motorista\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 5:
			novoSalario = (float) (salario +(0.05 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Estoquista\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 6:
			novoSalario = (float) (salario +(0.08 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Técnico de Ti\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		default:
			System.out.println("Código de colaborador inválido");
		}
		
		
	}

}
