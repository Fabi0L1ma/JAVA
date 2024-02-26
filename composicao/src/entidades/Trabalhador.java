package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador level;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	//NÃO MARCAR NO ATRIBUTO QUE SEJA LISTA
	public Trabalhador(String nome, NivelTrabalhador level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getLevel() {
		return level;
	}

	public void setLevel(NivelTrabalhador level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	//APAGAR SETCONTRATOS SENAO ELE ESTARÁ RECEBENDO OUTRA LISTA DE CONTRATOS (NÃO QUEREMOS QUE ISSO OCORRA)
	
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double rendimento(int ano, int mes) {
		
		Calendar cal = Calendar.getInstance();
		
		double soma = salarioBase;
		
		for(HoraContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if(ano == c_ano && mes == c_mes){
				soma += c.totalValor();
			}
		}
		
		return soma;
	}
	

}
