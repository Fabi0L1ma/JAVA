package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.contaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da conta");
		System.out.print("Numero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		System.out.print("Saldo: R$");
		double saldo = sc.nextDouble();
		
		Conta conta = new Conta(numeroConta, titular, saldo);
		
		System.out.println("\n" + conta + "\n");
		
		System.out.println("Dados da conta ");
		System.out.print("Numero da conta: ");
		int numeroContaEmpresa = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String titularEmpresa = sc.nextLine();
		System.out.print("Saldo: R$");
		double saldoEmpresa = sc.nextDouble();
		System.out.print("Limite de emprestimo da empresa: R$");
		double limite = sc.nextDouble();
		
		ContaEmpresa conta_empresa = new ContaEmpresa(numeroContaEmpresa, titularEmpresa, saldoEmpresa, limite);
		
		System.out.println("\n" + conta_empresa + "\n");
		
		sc.close();
	}

}
