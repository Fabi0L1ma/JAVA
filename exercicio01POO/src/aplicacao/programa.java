package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Medidas;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Medidas medidas = new Medidas();
		
		System.out.print("Largura: ");
		medidas.largura = sc.nextDouble();
		System.out.print("Altura: ");
		medidas.altura = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA = " + medidas.area());
		System.out.println("PERIMETRO: " + medidas.perimetro());
		System.out.println("DIAGONAL: " + medidas.diagonal());
	}

}
