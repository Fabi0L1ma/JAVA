import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0,  par = 0 , impar = 0;

        System.out.print("Digite o numero: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.print(numero + " é PAR.");
        }else{
            System.out.print(numero + " é IMPAR.");
        }
    }
}