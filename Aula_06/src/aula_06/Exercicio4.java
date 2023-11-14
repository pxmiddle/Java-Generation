package aula_06;
import java.util.*;
public class Exercicio4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HashSet<Integer> valores = new HashSet<Integer>();
		int busca;
		
		
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
		
		System.out.println("Digite o número que você deseja encontrar: ");
		busca = sc.nextInt();			
			if(valores.contains(busca) == true) {
				System.out.printf("O número %d foi encontrado!", busca);
		}
			else {
				System.out.printf("O número %d não foi encontrado!", busca);
			}

		}
		
	}

