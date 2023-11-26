package entidade;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "NOME: " + nome 
				+ "\nVALOR: R$" + String.format("%.2f", preco)
				+ "\nQTD: " + quantidade 
				+ "\nVALOR TOTAL: R$" + String.format("%.2f", totalValorEstoque());
	}
	
}

