package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Caminho: ");
		String caminhoArquivo = sc.nextLine();
		
		File caminho = new File(caminhoArquivo);
		
		/*
		File[] pastas = caminho.listFiles(File::isDirectory); // LISTA DE PASTAS
		
		System.out.println("Pastas: ");
		
		for(File pasta: pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = caminho.listFiles(File::isFile); // LISTA DE ARQUIVOS
		
		System.out.println("Arquivos: ");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(caminhoArquivo + "\\subPasta").mkdir(); // CRIA SUBPASTAS
		System.err.println("Diretorio Criado: " + sucesso);
		*/
		
		System.out.println("getName: " + caminho.getName()); // NOME DO ARQUIVO
		System.out.println("getParent: " + caminho.getParent()); // NOME DO CAMINHO SEM O NOME DO ARQUIVO
		System.out.println("getPath: " + caminho.getPath()); // CAMINHO COM NOME DO ARQUIVO
		
		sc.close();
	}

}
