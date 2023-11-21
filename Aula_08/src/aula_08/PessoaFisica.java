package aula_08;

public class PessoaFisica extends Cliente{

	private String CPF;
	
	public PessoaFisica(int codCliente, String nome, char sexo, int idade, String telefone, String CPF) {
		super(codCliente, nome, sexo, idade, telefone);
		this.CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.CPF);
	}

}
