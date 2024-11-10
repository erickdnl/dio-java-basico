
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public ContaCorrente(Cliente cliente, double valorInicial) {
		super(cliente);
		this.depositar(valorInicial);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	
	
	
}
