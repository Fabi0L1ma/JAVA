package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd;
		
		System.out.print("Qtd de Alugueis: ");
		qtd = sc.nextInt();
		
		Aluguel[] vetor = new Aluguel[10];
		
		if(qtd < 10 && qtd >= 0) {
			
			for(int i = 0; i < qtd; i++) {
				sc.nextLine();
				System.out.print("NOME: ");
				String nome = sc.nextLine();
				
				System.out.print("EMAIL: ");
				String email = sc.nextLine();
				
				System.out.print("QUARTO: ");
				int quarto = sc.nextInt();
				
				if(vetor[quarto] == null) {
					vetor[quarto] = new Aluguel(nome, email);
				}else {
					System.out.println("Quarto ocupado!");
				}
			}
		}
				for(int i = 0; i < vetor.length; i++) {
					if(vetor[i] != null) {
						System.out.println(i+ ":" + vetor[i].getNome() + "," + vetor[i].getEmail());
					}
				}
		sc.close();
	}

}
