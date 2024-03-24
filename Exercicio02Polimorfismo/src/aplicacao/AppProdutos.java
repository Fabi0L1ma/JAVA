package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;
import entidade.ProdutoImportado;
import entidade.ProdutoUsado;

public class AppProdutos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Qtd de Produtos: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Produto #" + (i+1) + ":");
			System.out.print("Comum, Importado ou Usado [C/I/U]? ");
			char op = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Preço: R$");
			double preco = sc.nextDouble();
			
			if(op == 'I') {
				System.out.print("Valor da taxa da Alfandega: R$");
				double taxa =sc.nextDouble();
				
				Produto produto_importado = new ProdutoImportado(nome, preco, taxa);
				lista.add(produto_importado);
				
			}else if(op == 'U') {
				System.out.print("Data de Fabricação: ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				Produto produto_usado = new ProdutoUsado(nome, preco, data);
				lista.add(produto_usado);
				
			}else {
				Produto produtoComum = new Produto(nome, preco);
				lista.add(produtoComum);
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO: ");
		for(Produto produto : lista) {
			System.out.println(produto.etiquetaPreco());
		}
		
		sc.close();
	}

}
