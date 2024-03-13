package entidades;

public class contaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	public contaPoupanca() {
		super();
	}

	public contaPoupanca(Integer numeroConta, String titular, Double saldo, Double taxaJuros) {
		super(numeroConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atulizarSaldo() {
		this.saldo += saldo * taxaJuros;
	}
}
