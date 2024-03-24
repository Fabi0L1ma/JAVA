package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.FuncionarioTercerizado;

public class AppFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Qtd de Funcionarios: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Funcinario #" + (i+1) + ":" );
			
			System.out.print("Funcionario é tercerizado [S/N]?");
			char op = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor Hora: R$");
			double valorHora = sc.nextDouble();
			
			if(op == 'S') {
				System.out.print("Despesa Adicional: R$");
				double addDesp = sc.nextDouble();
				
				Funcionario funcionario = new FuncionarioTercerizado(nome, horas, valorHora, addDesp);
				
				lista.add(funcionario);
			}else {
				Funcionario funcionario = new Funcionario(nome, horas, valorHora);
				
				lista.add(funcionario);
			}
		}
		
		System.out.println();
		
		System.out.println("PAGAMENTOS: ");
		
		for(Funcionario funcionario : lista) {
			System.out.println(funcionario.getNome() + " - R$" + funcionario.pagamento());
		}
		
		sc.close();
	}

}
