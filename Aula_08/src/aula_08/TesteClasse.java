package aula_08;
public class TesteClasse {

	public static void main(String[] args) {
	Cliente cliente1 = new Cliente(1, "Pablo", 'M', 24, "11 99777877");
	
	cliente1.visualizar();
	System.out.println("\nIdade do cliente: " + cliente1.getIdade());
	System.out.println("\nTelefone do cliente: " + cliente1.getTelefone());
	cliente1.setIdade(25);
	cliente1.setTelefone("11 946457267");
	cliente1.visualizar();
	
	PessoaFisica pf = new PessoaFisica(2, "Lucia", 'F', 30, "11 95522-4433", "154.778.888-72");
	pf.visualizar();
	pf.setNome("Julia");
	pf.setIdade(31);
	pf.visualizar();
	
	PessoJuridica pj = new PessoJuridica(3, "Fred Inc.", 'M', 77, "77 6644-9862", "744.6877-00");
	pj.visualizar();
	pj.setTelefone("11 2251-4780");
	pj.setCnpj("77.051.733");
	pj.visualizar();
	}

}
