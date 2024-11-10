
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco meuBanco = new Banco("Banco Digital XYZ");
		
		meuBanco.adicionarCliente(new Cliente("Maria", "12345678900"));
		meuBanco.adicionarCliente(new Cliente("João", "98765432100"));
		
		meuBanco.criarConta(meuBanco.consultarCliente("12345678900"), new ContaCorrente(meuBanco.consultarCliente("12345678900"), 100));
		
		meuBanco.consultarCliente("12345678900");
		
	}

}
