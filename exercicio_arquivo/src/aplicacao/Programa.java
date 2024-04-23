package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Produto> listaProduto = new ArrayList<>();
		
		String caminho = "c:\\temp\\arquivo_ex.csv";

		File arquivoFonte = new File(caminho);
		
		String caminhoNovoArquivo = arquivoFonte.getParent(); // PEGA O DIRETORIO
		
		boolean confirmacao = new File(caminhoNovoArquivo + "\\pasta_nova").mkdir(); // CRIA UMA NOVA PASTA
		
		String arquivoSaida = caminhoNovoArquivo + "\\pasta_nova\\valores.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String itens = br.readLine();
			
			while(itens != null) {
				
				String[] campo = itens.split(",");
				String nome = campo[0];
				double preco = Double.parseDouble(campo[1]);
				int qtd = Integer.parseInt(campo[2]);
				
				Produto produto = new Produto(nome, preco, qtd);
				
				listaProduto.add(produto);
				
				itens = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida))) {
				
				for(Produto p : listaProduto) {
					bw.write(p.getNome() + "," + String.format("%.2f", p.total()));
					bw.newLine();
				}
				
			}catch(IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
 		
		

	}

}
