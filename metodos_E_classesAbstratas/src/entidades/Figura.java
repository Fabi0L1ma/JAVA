package entidades;

import entidades.enums.Color;

public abstract class Figura {
	
	private Color color;
	
	public Figura() {
	}

	public Figura(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
