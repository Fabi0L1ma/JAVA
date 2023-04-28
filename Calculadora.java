import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  qtd, i, opc;
        float numero[] = new float[2];
        double calculo = 0;
        char resp;

        do {
            System.out.println("CALCULADORA");
            System.out.println("[1] - SOMA");
            System.out.println("[2] - SUBTRAÇÃO");
            System.out.println("[3] - MULTIPLICAÇÃO");
            System.out.println("[4] - DIVISAO");
            System.out.println("[0] - SAIR");

            System.out.print("Escolha as opcoes: ");
            opc = sc.nextInt();
            System.out.println();

            calculo = 0;

            switch (opc){
                case 1:
                    System.out.println("SOMA:");
                    for (i = 0; i < 2; i++){
                        System.out.print("Digite o " + (i + 1) + "º numero: ");
                        numero[i] = sc.nextInt();
                        calculo += numero[i];
                    }

                    System.out.println("RESULTADO = " + calculo);
                    System.out.println();

                break;

                case 2:
                    System.out.println("SUBTRAÇÃO:");
                    for (i = 0; i < 2; i++){
                        System.out.print("Digite o " + (i + 1) + "º numero: ");
                        numero[i] = sc.nextFloat();
                    }

                    calculo = numero[0] - numero[1];

                    System.out.println("RESULTADO = " + calculo);
                    System.out.println();

                break;

                case 3:
                    calculo = 1;
                    System.out.println("MULTIPLICAÇÃO: ");
                    for (i = 0; i < 2; i++){
                        System.out.print("Digite o " + (i + 1) + "º numero: ");
                        numero[i] = sc.nextFloat();
                        calculo *= numero[i];
                    }

                    System.out.println("RESULTADO = " + calculo);
                    System.out.println();

                break;

                case 4:
                    System.out.println("DIVISÃO:");
                    for (i = 0; i < 2; i++){
                        System.out.print("Digite o " + (i + 1) + "º numero: ");
                        numero[i] = sc.nextFloat();
                    }

                    calculo = numero[0] / numero[1];
                    System.out.println("RESULTADO = " + calculo);
                    System.out.println();

                break;
            }

        }while(opc != 0);

    }
}