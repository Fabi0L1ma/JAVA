package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class ResolvendoSemPoo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("VALORES DO TRINAGULO X: ");
		System.out.print("A: ");
		xA = sc.nextDouble();
		System.out.print("B: ");
		xB = sc.nextDouble();
		System.out.print("C: ");
		xC = sc.nextDouble();
		
		System.out.println("VALORES DO TRINAGULO Y: ");
		System.out.print("A: ");
		yA = sc.nextDouble();
		System.out.print("B: ");
		yB = sc.nextDouble();
		System.out.print("C: ");
		yC = sc.nextDouble();
		
		double pX = (xA + xB + xC)/2.0;
		double areaX = Math.sqrt(pX*(pX - xA)*(pX - xB)*(pX - xC));
		
		double pY = (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(pY*(pY - yA)*(pY - yB)*(pY - yC));
		
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
