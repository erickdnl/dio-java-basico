
import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private List<Conta> clienteContas;
	
	
	

	public Cliente(String nome, String cpf) {
		super();
		
		this.nome = nome;
		this.cpf = cpf;
		this.clienteContas = new ArrayList<>();
		
	}
	
	public void abrirConta(Conta conta) {
		this.clienteContas.add(conta);
	}
	
	public void imprimirContas() {
		System.out.println(clienteContas);
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", clienteContas=" + clienteContas + "]";
	}
	
	

	
}
