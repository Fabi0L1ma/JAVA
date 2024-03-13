package entidade;

public class ContaEmpresa extends Conta {
	
private Double limiteEmprestimo;
	
	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer numeroConta, String titular, Double saldo, Double limiteEmprestimo) {
		super(numeroConta, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor <= limiteEmprestimo) {
			saldo += valor - 10.0;
		}
	}
	
	public String toString() {
		return "Numero da Conta: " + numeroConta +
				"\nTitular: " + titular +
				"\nSaldo: R$" + String.format("%.2f", saldo)+ 
				"\nLimite de Emprestimo: " + limiteEmprestimo;
	}

}
