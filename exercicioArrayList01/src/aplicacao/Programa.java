package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Qtd a ser cadastrado: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("FUNCIONARIO #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			while(existeId(lista, id)) { 
				System.out.println();
				System.out.println("ID já cadastrado!");
				System.out.print("Tente novamente: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("NOME: ");
			String nome = sc.nextLine();
			System.out.print("SALARIO: R$");
			Double salario = sc.nextDouble();
			System.out.println();
			
			Funcionario empregado = new Funcionario(id, nome, salario);
			
			lista.add(empregado);
		}
		
		System.out.print("ID do funcionario que terá aumento: ");
		Integer idAumento = sc.nextInt();
		
		Funcionario empregado = lista.stream().filter(x -> x.getId().equals(idAumento)).findFirst().orElse(null);
		
		//Integer pos = posicao(lista, idAumento);
		
		//if(pos == null)
		
		if(empregado == null) {
			System.out.println("ESSE ID NÃO EXISTE!");
		}else {
			System.out.print("Porcentagem %: ");
			double porcentagem = sc.nextDouble();
			
			empregado.aumentoSalario(porcentagem);
			
			//lista.get(pos).aumentoSalario(porcentagem);
		}	
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		
		//for(Funcionario empregado : lista)
		
		for(Funcionario emp : lista) {
			System.out.println(emp);
		}
		
		sc.close();

	}
	
	public static Integer posicao(List<Funcionario> listaTeste, int id) {
		for(int i = 0; i < listaTeste.size(); i++) {
			if(listaTeste.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}
	
	public static boolean existeId(List<Funcionario> listaTeste, int id) {
		Funcionario empregado = listaTeste.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empregado != null;
	}

}
