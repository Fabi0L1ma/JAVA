package entidade;

public class ContaPoupanca extends Conta{
	
	private Double taxaJuros;
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(Integer numConta, String nome, Double saldo, Double taxaJuros) {
		super(numConta, nome, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void retirar(double valor) {
		saldo -= valor;
	}

}
