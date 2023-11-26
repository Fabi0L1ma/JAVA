package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class ResolvendoComPoo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y; //ctrl + shift + 0 IMPORTA
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("VALORES DO TRINAGULO X: ");
		System.out.print("A: ");
		x.a = sc.nextDouble();
		System.out.print("B: ");
		x.b = sc.nextDouble();
		System.out.print("C: ");
		x.c = sc.nextDouble();
		
		System.out.println("VALORES DO TRINAGULO Y: ");
		System.out.print("A: ");
		y.a = sc.nextDouble();
		System.out.print("B: ");
		y.b = sc.nextDouble();
		System.out.print("C: ");
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("AREA DO TRIANGULO X: %.2f%n", areaX);
		System.out.printf("AREA DO TRIANGULO y: %.2f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("MAIOR AREA É DO X!");
		}else if(areaX == areaY) {
			System.out.println("POSSUI AREAS IGUAIS!");
		}else {
			System.out.println("MAIOR AREA É O Y!");
		}
		
		sc.close();
		
	}
}
