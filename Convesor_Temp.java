import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double c, k, re, ra, f;

        System.out.print("Digite a temperatura em Celsius: ");
        c = sc.nextDouble();

        f = (c * 1.8) + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = (c * 1.8) + 32 + 459.67;

        System.out.println("Fahrenheit = " + f + "º");
        System.out.println("Kelvin = " + k + "º");
        System.out.println("Réaumur = " + re + "º");
        System.out.println("Rankine = " + ra + "º");


    }
}