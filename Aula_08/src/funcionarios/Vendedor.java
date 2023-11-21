package funcionarios;

public class Vendedor extends Funcionarios{
	
	private Boolean cotaBatida;

	public Vendedor(int idFunc, String nome, String dtNascimento, String cargo, float salario, boolean cotaBatida) {
		super(idFunc, nome, dtNascimento, cargo, salario);
		this.cotaBatida = cotaBatida;
	}

	public Boolean getCotaBatida() {
		return cotaBatida;
	}

	public void setCotaBatida(Boolean cotaBatida) {
		this.cotaBatida = cotaBatida;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		if(cotaBatida) {
			System.out.println("A cota foi batida");
		}else {
			System.out.println("Cota ainda precisa ser batida");
		}
	}
}
