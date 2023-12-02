package entidades;

public class Cliente {
	
	private int numConta;
	private String nomeDoTitular;
	private double saldo;
	
	public Cliente() {
	}
	
	public Cliente(int numConta, String nomeDoTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeDoTitular = nomeDoTitular;
		deposito(depositoInicial);
	}
	
	public Cliente(int numConta, String nomeDoTitular) {
		this.numConta = numConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	// METODOS
	
	public void deposito(double valor) {
		this.saldo += valor;
		
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
		this.saldo -= 5;
	}
	
	public String toString() {
		return "Conta: " + numConta
				+ "\nCliente: " + nomeDoTitular 
				+ "\nSaldo: R$" + String.format("%.2f", saldo);
	}

}
