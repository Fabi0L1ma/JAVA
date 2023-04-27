import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade, mes, resultado;
        int anos = 365, meses = 30, qtd_dias;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite a quantidade de meses: ");
        mes = sc.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        qtd_dias = sc.nextInt();

        resultado = (idade*anos) + (mes*meses) + qtd_dias;

        System.out.print("Dias totais: " + resultado);
    }
}