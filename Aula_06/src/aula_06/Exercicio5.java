package aula_06;

import java.util.*;

public class Exercicio5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int opcao = 1;
		String nome;

		System.out.println("*******************");
		System.out.println(
				"\n1- Adicionar Clientes na Fila\n2- Listar todos os Clientes\n3- Retirar Clientes da fila\n0- Sair");
		System.out.println("\n*******************");

		while (opcao !=0) {
			System.out.println("Entre com a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				System.out.println("Insira seu nome: ");
				nome = sc.next();
				fila.add(nome);
				break;
			case 2:
				System.out.println("Lista de clientes: ");
				System.out.println(fila);
				break;
			case 3:
				System.out.println("O Cliente foi Chamado!");
				fila.remove();
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				opcao = 0;
				break;
			default:
				System.out.println("Insira uma opção válida.\n");
				break;
			}
		}
	}

}
