package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("NOME: ");
		funcionario.nome = sc.nextLine();
		System.out.print("SALARIO BRUTO: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("IMPOSTO: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("FUNCIONARIO: \n" + funcionario.toString());
		
		System.out.println();
		System.out.print("PORCENTAGEM A SER ADD: ");
		double porcentagem = sc.nextDouble();
		funcionario.addSalario(porcentagem);
		
		System.out.println();
		System.out.println("DADOS ATUALIZADOS: " + funcionario.toString());
		
		sc.close();
	}

}
