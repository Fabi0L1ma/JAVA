package aplciacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente;
		
		System.out.println("DADOS DA CONTA");
		System.out.print("Digite o número da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o nome do titular: ");
		String nome = sc.nextLine();
		
		System.out.print("Existe um depósito inicial [S/N]: ");
		char resp = sc.next().charAt(0);
		
		if(resp == 'S') {
			System.out.print("Valor inicial: R$");
			double depositoInicial = sc.nextDouble();
			cliente = new Cliente(conta, nome, depositoInicial);
			
		}else {
			cliente = new Cliente(conta, nome);
		}
		
		System.out.println("\nDADOS DA CONTA \n" + cliente.toString());
		
		System.out.print("\nDepositar valor: R$");
		double valor = sc.nextDouble();
		cliente.deposito(valor);
		
		System.out.println("\nDADOS DA CONTA ATUALIZADO \n" + cliente.toString());
		
		System.out.print("\nRetirar valor: R$");
		valor = sc.nextDouble();
		cliente.retirar(valor);
		
		System.out.println("\nDADOS DA CONTA ATUALIZADO \n" + cliente.toString());
		
		
		sc.close();		
	}

}
