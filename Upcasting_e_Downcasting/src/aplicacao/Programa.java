package aplicacao;

import entidade.Conta;
import entidade.ContaEmpresa;
import entidade.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, "Fabio Lima", 0.0);
		ContaEmpresa contaEmpresa = new ContaEmpresa(1002, "Maria", 0.0, 500.0); 

		//UPOCASTING 
		// CASTING DA SUBCLASSE PARA SUPERCLASSE
		
		Conta conta1 = contaEmpresa;
		Conta conta2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		//CASTING DA SUPERCLASSE PARA SUBCLASSE
		
		ContaEmpresa conta4 = (ContaEmpresa)conta2;
		conta4.emprestimo(200.0);
		
	
		// ContaEmpresa conta5 = (ContaEmpresa)conta3;

		if (conta3 instanceof ContaEmpresa) { //INSTANCEOF (VERIFICA SE CONTA3 É INSTANCIA DE CONTA EMPRESA)
			ContaEmpresa conta5 = (ContaEmpresa) conta3;
			conta5.emprestimo(200.00);
			System.out.println("Emprestimo!");
		}

		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca) conta3;
			conta5.atulizarSaldo();
			System.out.println("Atualizado!");
		}

	}

}
