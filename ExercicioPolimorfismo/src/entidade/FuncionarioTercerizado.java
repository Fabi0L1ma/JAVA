package entidade;

public class FuncionarioTercerizado extends Funcionario {
	
	private Double despesaAdd;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorHora, Double despesaAdd) {
		super(nome, horas, valorHora);
		this.despesaAdd = despesaAdd;
	}

	public Double getDipesaAdd() {
		return despesaAdd;
	}

	public void setDipesaAdd(Double despesaAdd) {
		this.despesaAdd = despesaAdd;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + (this.despesaAdd * 1.10);
	}
	
	


}
