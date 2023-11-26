package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("ENTRE COM DADOS DO PRODUTO");
		System.out.print("NOME: ");
		produto.nome = sc.nextLine();
		System.out.print("PREÇO: R$");
		produto.preco = sc.nextDouble();
		System.out.print("QUANTIDADE: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("DADOS DO PRODUTO \n" + produto.toString());
		
		System.out.println();
		System.out.print("ENTRE COM QUATIDADE DE PRODUTOS A SER ADCIONADOS NO ESTOQUE: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("DADOS ATUALIZADOS \n" + produto.toString());
		
		System.out.println();
		System.out.print("ENTRE COM A QUANTIDADE DE PRODUTOS A SER REMOVIDOS DO ESTOQUE: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("DADOS ATUALIZADOS \n" + produto.toString());
		
		sc.close();
	}
}
