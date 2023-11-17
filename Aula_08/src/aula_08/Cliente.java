package aula_08;

public class Cliente {

	private int codCliente;
	private String nome;
	private char sexo;
	private int idade;
	private String telefone;

	public Cliente(int codCliente, String nome, char sexo, int idade, String telefone) {
		super();
		this.codCliente = codCliente;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.telefone = telefone;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {

		String tipo = "";
		switch (this.sexo) {
		case 'F' -> tipo = "Feminino";
		case 'M' -> tipo = "Masculino";
		}

		System.out.println("\n\n****************************************");
		System.out.println("Dados do Cliente");
		System.out.println("****************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Tipo da conta: " + tipo);
		System.out.println("Idade: " + this.idade);
		System.out.println("Telefone: " + this.telefone);
	}
}
