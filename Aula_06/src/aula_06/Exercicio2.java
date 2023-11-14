package aula_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		int numero;
		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);
		
		System.out.println(valores);
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		
		if(valores.contains(numero) == true) {
			System.out.println("O número 7 está localizado na posição: " + valores.indexOf(numero));
		}
		else
			System.out.printf("O número %d não foi encontrado!", numero);
	}

}
