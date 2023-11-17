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
	}

}
