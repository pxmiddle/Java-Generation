package aula_06;
import java.util.*;
public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila);
		
		System.out.println(fila.poll());
		System.out.println(fila);
		
		System.out.println("A Maria está na fila?: " + fila.contains("Maria"));

		System.out.println("Número de elementos na fila: " + fila.size());
		
		int contador = 0;
		
		for(var pessoa : fila) {
			contador++;
			if(pessoa.equalsIgnoreCase("Maria")) {
				System.out.println(contador);
			}
		}
		
	}

}
