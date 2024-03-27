package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Contribuinte;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Qtd de Contribuintes: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Contribuinte #" + (i+1) + ":");
			
			System.out.print("Juridica ou Fisica [J/F]? ");
			char op = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: R$");
			double rendaAnual = sc.nextDouble();
			
			if(op == 'F') {
				System.out.print("Gasto com Saude: R$");
				double gastoSaude = sc.nextDouble();
				
				Contribuinte cFisico = new PessoaFisica(nome, rendaAnual, gastoSaude);
				lista.add(cFisico);
				
			}else if(op == 'J') {
				System.out.print("Numero de Funcionarios: ");
				int numFunc = sc.nextInt();
				
				Contribuinte cJuridica = new PessoaJuridica(nome, rendaAnual, numFunc);
				lista.add(cJuridica);
			}
			System.out.println();
		}
		
		System.out.println("\nImpostos Pagos: ");
		for(Contribuinte c : lista) {
			System.out.println(c.getNome() + ": R$" + String.format("%.2f", c.imposto()));
		}
		
		double totalImposto = 0.0;
	
		for(Contribuinte c : lista) {
			totalImposto +=  c.imposto();
		}
		
		System.out.print("\nTotal de Imposto: R$" + String.format("%.2f", totalImposto));
		
		sc.close();

	}

}
