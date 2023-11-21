package funcionarios;

public class Gerente extends Funcionarios{
	
	private int subordinados;
	
	public Gerente(int idFunc, String nome, String dtNascimento, String cargo, float salario, int subordinados) {
		super(idFunc, nome, dtNascimento, cargo, salario);
		this.subordinados = subordinados;
	}

	public int getSubordinados() {
		return subordinados;
	}

	public void setSubordinados(int subordinados) {
		this.subordinados = subordinados;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Numero de subordinados: " + this.subordinados);
	}
	

}
