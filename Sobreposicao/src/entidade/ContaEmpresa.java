package entidade;

public class ContaEmpresa extends Conta {
	
	private Double limiteEmprestimo;
	
	public ContaEmpresa() {
	}

	public ContaEmpresa(Integer numConta, String nome, Double saldo, Double limiteEmprestimo) {
		super(numConta, nome, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getEmprestimo() {
		return limiteEmprestimo;
	}

	public void setEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		if(valor <= limiteEmprestimo) {
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void retirar(double valor) {
		super.retirar(valor); // REUTILIZA O CODIGO DA SUPERCLASSE
		saldo -= 2.0;
	}
	
	public String toString() {
		return "Numero da conta: " + numConta +
				"\nTitular: " + nome +
				"\nLimite do Emprestimo: R$" + String.format("%.2f", limiteEmprestimo)+
				"\nSaldo: R$" + String.format("%.2f", saldo);
	}
}
