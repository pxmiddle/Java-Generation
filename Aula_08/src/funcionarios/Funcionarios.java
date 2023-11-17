package funcionarios;


public class Funcionarios {

	private int idFunc;
	private String nome;
	private String dtNascimento;
	private String cargo;
	private float salario;

	public Funcionarios(int idFunc, String nome, String dtNascimento, String cargo, float salario) {
		this.idFunc = idFunc;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void visualizar() {

		System.out.println("\n\n****************************************");
		System.out.println("Dados do Funcionário");
		System.out.println("****************************************");
		System.out.println("Código de Registro do Funcionário: " + this.idFunc);
		System.out.println("Nome do Funcionário: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dtNascimento);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário: " + this.salario);
	}

}
