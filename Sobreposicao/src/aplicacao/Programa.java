package aplicacao;

import entidade.Conta;
import entidade.ContaEmpresa;
import entidade.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1001, "Alex", 1000.0);
		conta1.retirar(200.0);
		System.out.println(conta1.getSaldo());
		
		Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		conta2.retirar(200.0);
		System.out.println(conta2.getSaldo());
		
		Conta conta3 = new ContaEmpresa(1003,  "Bob", 1000.0, 500.0);
		conta3.retirar(200.0);
		System.out.println(conta3.getSaldo());

	}

}
