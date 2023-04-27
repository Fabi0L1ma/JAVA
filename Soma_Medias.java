import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float num1[] = new float[3];
        float num2[] = new float[3];
        float med1 = 0, med2 = 0, medTotal = 0, somaDasMedias = 0;
        int i;

        System.out.println("NUMEROS DA PRIMEIRA MEDIA:");
        for (i = 0; i < 3; i++){
            System.out.print(i+1 + "º numero: ");
            num1[i] = sc.nextFloat();
            med1 += num1[i];
        }

        System.out.println("NUMEROS DA SEGUNDA MEDIA:");
        for (i = 0; i < 3; i++){
            System.out.print(i+1 + "º numero: ");
            num2[i] = sc.nextFloat();
            med2 += num2[i];
        }
        System.out.println();

        System.out.println("PRIMEIRA MEDIA: " + med1/i);
        System.out.println("SEGUNDA MEDIA: " + med2/i);

        somaDasMedias = (med1/i) + (med2/i);
        medTotal = somaDasMedias/2;

        System.out.println("SOMA DAS MEDIAS: " + somaDasMedias);
        System.out.print("MEDIA TOTAL: " + medTotal);

    }
}