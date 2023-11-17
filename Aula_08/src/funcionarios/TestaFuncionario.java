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
		
		
	}

}
