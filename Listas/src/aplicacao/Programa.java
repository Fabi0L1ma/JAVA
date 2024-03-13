package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		// ADICIONA VALORES A LISTA
		lista.add("FABIO");
		lista.add("MARIA");
		lista.add("ANA");
		lista.add("ALICE");
		
		
		// ADICIONA VALOR A LISTA NO INDICE DESEJADO
		lista.add(2, "FRANCISCO");
	
		// MOSTRA TAMANHO DA LISTA
		System.out.println(lista.size());
		
		for(String obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		// REMOVE VALORES DA LISTA
		//lista.remove("FABIO");
		//lista.remove(2);
		lista.removeIf(obj -> obj.charAt(0) == 'A');
		
		for(String obj : lista) {
			System.out.println(obj);
		}
		
		//ENCONTRAR A POSIÇAO DE UM ELEMENTO
		System.out.println();
		System.out.println("POSIÇÃO DE MARIA: " + lista.indexOf("MARIA"));
		
		System.out.println();
		
		//CRIA UMA LISTA COM PESSOAS COM DETERMINADO VALOR ESTABELECIDO
		List<String> resultado = lista.stream().filter(obj -> obj.charAt(0) == 'F').collect(Collectors.toList());
		
		for(String obj : resultado) {
			System.out.println(obj);
		}
		System.out.println();
		
		//INDICA A PRIMEIRA POSIÇÃO DO ELEMENTO COM ESSE VALOR
		String nome = lista.stream().filter(obj -> obj.charAt(0) == 'F').findFirst().orElse(null);
		
		System.out.println(nome);
		
	}

}
