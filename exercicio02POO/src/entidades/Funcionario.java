package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void addSalario(double porcentagem) {
		salarioBruto += (this.salarioBruto * (porcentagem/100.00));
	}
	
	public String toString() {
		return "NOME: " + nome
				+ "\nSALARIO LIQUIDO: R$" + String.format("%.2f", salarioLiquido());
	}
}
