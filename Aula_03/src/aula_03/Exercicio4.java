package aula_03;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String caracterisca1, caracterisca2, caracterisca3;

		System.out.println("Insira a primeira caracteristica: ");
		caracterisca1 = leia.next();

		System.out.println("Insira a segunda caracteristica: ");
		caracterisca2 = leia.next();

		System.out.println("Insira a terceira caracteristica: ");
		caracterisca3 = leia.next();

		if (caracterisca1.equals("vertebrado")) {
			if (caracterisca2.equals("ave")) {
				if (caracterisca3.equals("carnivoro")) {
					System.out.println("Águia");
				}
				if (caracterisca3.equals("onívoro")) {
					System.out.println("Pomba");
				}
			}
			if (caracterisca2.equals("mamífero")) {
				if (caracterisca3.equals("onívoro")) {
					System.out.println("Homem");
				}
				if (caracterisca3.equals("herbívoro")) {
					System.out.println("Vaca");
				}
			}
		}

		if (caracterisca1.equals("invertebrado")) {

			if (caracterisca2.equals("inseto")) {
				if (caracterisca3.equals("hematofágo")) {
					System.out.println("Pulga");
				}
				if (caracterisca3.equals("herbívoro")) {
					System.out.println("Largata");
				}
			}
			if (caracterisca2.equals("anelídeo")) {
				if (caracterisca3.equals("hematofágo")) {
					System.out.println("Sanguessuga");
				}
				if (caracterisca3.equals("onívoro")) {
					System.out.println("Minhoca");
				}
			}
		} else {
			System.out.println();
		}
	}

}
