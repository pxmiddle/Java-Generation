package aula_metodos;
import static aula_metodos.package01.Classe02.*;

import aula_metodos.package01.Classe02;

public class TestaMetodos {

	public static void main(String[] args) {
		
		// Chamada para os métodos locais
		
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();
		
		// Chamada para os métodos da classe 01
		
		Classe01.metodoPublico01();
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		
		Classe02.metodoPublico02();

	}

	public static void metodoPublico() {
		System.out.println("Método Público");
	}

	static void metodoFriendly() {
		System.out.println("Método Friendly");
	}

	protected static void metodoProtegido() {
		System.out.println("Método Protegido");
	}

	private static void metodoPrivado() {
		System.out.println("Método Protegido");
	}

}
