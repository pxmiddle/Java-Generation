package aula_08;

public class PessoJuridica extends Cliente{
	private String cnpj;

	public PessoJuridica(int codCliente, String nome, char sexo, int idade, String telefone, String cnpj) {
		super(codCliente, nome, sexo, idade, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
}
