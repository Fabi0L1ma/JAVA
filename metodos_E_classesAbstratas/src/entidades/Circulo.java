package entidades;

import entidades.enums.Color;

public class Circulo extends Figura{
	
	private Double raio;

	public Circulo() {
		super();
	}

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
