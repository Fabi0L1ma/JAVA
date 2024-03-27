package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Figura;
import entidades.Retangulo;
import entidades.enums.Color;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Figura> lista = new ArrayList<>();
		
		System.out.print("Qtd de Figuras: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Figura #" + (i+1) + ": ");
			
			System.out.print("Retangulo ou Circulo [R/C]? ");
			char op = sc.next().charAt(0);
			
			System.out.print("Cor [PRETO, AZUL, VERMELHO]: ");
			Color cor = Color.valueOf(sc.next());
			
			if(op == 'R') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				
				Figura retangulo = new Retangulo(cor, largura, altura);
				lista.add(retangulo);
				
			}else if(op == 'C') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				
				Figura circulo = new Circulo(cor, raio);
				lista.add(circulo);
			}
		}
		
		
		System.out.println("\nAreas das Figuras: \n");
		for(Figura f : lista) {
			System.out.println(String.format("%.2f",f.area()));
			
		}
		
		sc.close();
	}

}
