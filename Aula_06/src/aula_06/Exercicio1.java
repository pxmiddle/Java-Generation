package aula_06;

import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		String cor = "";
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira a cor desejada: ");
			cor = sc.next();
			
			cores.add(cor);
		}
		
		System.out.println(cores);
		cores.sort(null);
		
		System.out.println(cores);

	}

}
