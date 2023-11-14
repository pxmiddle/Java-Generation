package aula_06;

import java.util.*;

public class Exercicio3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HashSet<Integer> numeros = new HashSet<Integer>();
		int valor = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um valor sem repetição: ");
			valor = sc.nextInt();
			numeros.add(valor);
		}
		Iterator<Integer> iNumeros = numeros.iterator();
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}
