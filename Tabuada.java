import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, i = 0, calculo;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        while (i < 10){
            i++;
            calculo = num * i;
            System.out.println(num + " x " + i + " = " + calculo);
        }
    }
}