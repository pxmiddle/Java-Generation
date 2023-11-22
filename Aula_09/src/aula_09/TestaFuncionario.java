package aula_09;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Pablo", 1, 17000.0f, 800.0F);
		System.out.println("Salário Calculado: " + g1.calcularSalario());
		Vendedor v1 = new Vendedor("Braia", 2, 5000.00F, 0.10F);
		System.out.println("Salário Calculado: " + v1.calcularSalario());
		
	}

}
