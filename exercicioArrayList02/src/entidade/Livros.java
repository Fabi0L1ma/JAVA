package entidade;

public class Livros {
	
	private Integer codigo;
	private String nome;
	private Double valor;
	
	public Livros() {	
	}
	
	public Livros(Integer codigo, String nome, Double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void desconto(double desconto) {
		this.valor += this.valor*(desconto/100);
	}
	
	public String toString() {
		return codigo + ", " + nome + ", " + valor;
	}
}
