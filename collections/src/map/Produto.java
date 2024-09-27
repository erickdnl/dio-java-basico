package map;

public class Produto {

	private String nome;
	private double preco;
	private int quantidde;
	
	
	public Produto(String nome, double preco, int quantidde) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidde = quantidde;
	}


	public String getNome() {
		return nome;
	}


	public double getPreco() {
		return preco;
	}


	public int getQuantidde() {
		return quantidde;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidde=" + quantidde + "]";
	}

	
	
	
	
}
