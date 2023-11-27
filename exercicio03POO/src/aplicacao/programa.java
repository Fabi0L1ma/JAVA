package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Estudante;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("NOME: ");
		estudante.nome = sc.nextLine();
		System.out.print("PRIMEIRA NOTA: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("SEGUNDA NOTA: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("TERCEIRA NOTA: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("MEDIA FINAL: " + estudante.mediaNota());
		
		if(estudante.mediaNota() >= 60.0) {
			System.out.print("APROVADO!");
		}else {
			System.out.println("REPROVADO!");
			System.out.printf("FALTARAM %.2f PONTOS", estudante.pontosFaltando());
		}
		
		sc.close();
	}

}
