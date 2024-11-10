
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public ContaPoupanca(Cliente cliente, double valorInicial) {
		super(cliente);
		this.depositar(valorInicial);
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "ContaPoupanca [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	
	
}
