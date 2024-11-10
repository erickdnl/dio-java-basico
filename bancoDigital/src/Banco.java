
import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> clientes;
	private List<Conta> contas;
	
	
	public Banco(String nome) {
		super();
		this.nome = nome;
		this.clientes = new ArrayList<>();
		this.contas = new ArrayList<>();
	}

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void criarConta(Cliente cliente, Conta conta) {
		contas.add(conta);
		cliente.abrirConta(conta);
	}
	
	public Cliente consultarCliente(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}
	
	
	
}
