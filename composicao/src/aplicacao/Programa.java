package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.HoraContrato;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("DEPARTAMENTO: ");
		String departamento = sc.nextLine();
		
		System.out.println("DADOS DO TRABALHADOR: ");
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		System.out.print("LEVEL: ");
		String level = sc.nextLine();
		System.out.print("BASE SALARIAL: ");
		double baseSalario = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(level), baseSalario, new Departamento(departamento));
		
		System.out.print("QTD DE CONTRATOS: ");
		int qtdContratos = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < qtdContratos; i++) {
			System.out.println("CONTRATO #" + (i+1) + ": ");
			System.out.print("DATA (DD/MM/YYYY): ");
			Date dataContrato = fmt.parse(sc.next());
			System.out.print("VALOR POR HORA: R$");
			double valorPorHora = sc.nextDouble();
			System.out.print("DURAÇÃO DO CONTRATO: ");
			int horas = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
			
			System.out.println();
		}
		
		System.out.println("ENTRE COM MES E ANO: ");
		String mesAno = sc.next();
		
		//Transformando String em inteiro
		int mes = Integer.parseInt(mesAno.substring(0, 2)); 
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("NOME: " + trabalhador.getNome());
		System.out.println("DEPARTAMENTO: " + trabalhador.getDepartamento().getNome());
		System.out.println("RENDIMENTO PARA " + mesAno + ": " + String.format("%.2f", trabalhador.rendimento(ano, mes)));
		
		sc.close();
	}

}
