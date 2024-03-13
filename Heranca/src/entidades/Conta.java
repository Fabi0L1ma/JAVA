package entidades;

public class Conta {
	
	protected Integer numeroConta;
	protected String titular;
	protected Double saldo;
	
	public Conta() {
	}

	public Conta(Integer numeroConta, String titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;	
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public String toString() { 
		return "Numero da conta: " + numeroConta + 
				"\nNome do Titular: " + titular +
			 	"\nSaldo: " + String.format("%.2f", saldo);
	}
	
	
	
}
