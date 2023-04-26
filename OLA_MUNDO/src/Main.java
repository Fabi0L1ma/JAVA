import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float nota[] = new float[5];
        String nome[] = new  String[5];


        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o seu nome: ");
            nome[i] = sc.next();
            System.out.printf("Digite a nota: ");
            nota[i] = sc.nextFloat();
        }
        System.out.println();


        for(int i = 0; i < 5; i++){
            if(nota[i] >= 7.0){
                System.out.println("Nome: " + nome[i]);
                System.out.println("Nota: " + nota[i] + " (APROVADO)");
            }else {
                System.out.println("Nome: " + nome[i]);
                System.out.println("Nota: " + nota[i] + " (REPROVADO)");
            }
        }

    }
}