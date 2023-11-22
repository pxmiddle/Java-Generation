package funcionarios;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionarios funcionario1 = new Funcionarios(1, "Pablo", "1999-03-19", "Gestor", 4335.0f);
		
		funcionario1.visualizar();
		System.out.println("\n\nID do Funcionário: " + funcionario1.getIdFunc());
		System.out.println("Nome do Funcionário: " + funcionario1.getNome());
		
		funcionario1.setCargo("Diretor de RH");
		funcionario1.setSalario(8000.0f);
		
		funcionario1.visualizar();
		
		Gerente g1 = new Gerente(2, "Jose", "1975-03-14", "Gerente", 7777.00F, 20);
		g1.visualizar();
		g1.setSalario(9999.00F);
		g1.setSubordinados(30);
		g1.visualizar();
		
		
		
		Vendedor v1 = new Vendedor(3, "Marcia", "1990-04-07", "Vendedor", 2100.00F, false);
		v1.visualizar();
		v1.setSalario(3000.00F);
		v1.visualizar();
		
	}

}
