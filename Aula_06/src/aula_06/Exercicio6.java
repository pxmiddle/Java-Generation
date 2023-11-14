package aula_06;

import java.util.*;

public class Exercicio6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		int opcao = 1;
		String nome = "";
		System.out.println("*******************");
		System.out.println(
				"\n1-  Adicionar Livro na pilha.\n2- Listar todos os livros\n3- Retirar livro da pilha\n0- Sair");
		System.out.println("\n*******************");

		while (opcao !=0) {
			System.out.println("Entre com a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {

			case 1:
				System.out.println("Insira seu nome: ");
				nome = sc.nextLine();
				livros.push(nome);
				break;
			case 2:
				System.out.println("Lista de clientes: ");
				System.out.println(livros);
				break;
			case 3:
				System.out.println("O Cliente foi Chamado!");
				livros.pop();
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
