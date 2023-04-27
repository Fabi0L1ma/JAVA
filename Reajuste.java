import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 0, reajuste;

        System.out.print("Digite o seu saldo: ");
        saldo = sc.nextDouble();

        reajuste = saldo + (saldo * 0.01);

        System.out.print("Saldo com reajuste de 1%: R$" + reajuste);
        
    }
}