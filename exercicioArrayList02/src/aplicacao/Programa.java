package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Livros;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Livros> lista = new ArrayList<>();
		
		System.out.print("Quantidade de livros a ser cadastrados: ");
		int qtd = sc.nextInt();
		
		System.out.println("Cadastro de livros: ");
		for(int i = 0; i < qtd; i++) {
			System.out.println("Livro #" + (i+1) + ":");
			
			System.out.print("CODIGO: ");
			int cod = sc.nextInt();
			
			while(existeCod(lista, cod)) {
				System.out.println("CODIGO JÁ EXISTE!");
				System.out.println("Tente outro: ");
				cod = sc.nextInt();
			}
			
			sc.nextLine();
			
			System.out.print("NOME: ");
			String nome = sc.nextLine();
			
			System.out.print("VALOR: R$");
			double valor = sc.nextDouble();
			
			System.out.println();
			
			Livros books = new Livros(cod, nome, valor);
			
			lista.add(books);
		}
		
		System.out.println("Codigo do livro que tera aumento: ");
		int codAumento = sc.nextInt();
		
		Livros books = lista.stream().filter(x -> x.getCodigo().equals(codAumento)).findFirst().orElse(null);
		
		if(books == null) {
			System.out.println("ESSE LIVRO NÃO EXISTE!");
		}else {
			System.out.println("Porcentagem para DESCONTO: ");
			int desc = sc.nextInt();
			
			books.desconto(desc);
		}
		
		for(Livros obj : lista) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean existeCod(List<Livros> listaTeste, int cod) {
		Livros books = listaTeste.stream().filter(x -> x.getCodigo().equals(cod)).findFirst().orElse(null);
		return books != null;
	}

}
