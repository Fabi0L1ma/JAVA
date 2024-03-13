package entidade;

public class Conta {
	
	protected Integer numConta;
	protected String nome;
	protected Double saldo;
	
	public Conta() {
	}

	public Conta(Integer numConta, String nome, Double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor + 5.0;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public String toString() {
		return "Numero Conta: " + numConta +
				"\nNome Titular: " + nome + 
				"\nSaldo: R$" + String.format("%.2f", saldo);
	}
	

}
