import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome[] = new String[5];
        float altura[] = new float[5];
        char sexo[] = new char[5];
        float maiorAltura = 0, menorAltura, AlturaH = 0, medAlturaH = 0;
        int i, qtd_H = 0, numMulheres = 0;

        for(i = 0; i < 5; i++){
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Altura: ");
            altura[i] = sc.nextFloat();
            System.out.print("Sexo [M] ou [F]: ");
            sexo[i] = sc.next().charAt(0);
        }

        menorAltura = altura[0];

        for (i = 0; i < 5; i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if (sexo[i] =='M'){
                AlturaH += altura[i];
                qtd_H += 1;
            }else {
                numMulheres += 1;
            }
        }

        medAlturaH = AlturaH/qtd_H;

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Media de altura de homens: " + medAlturaH);
        System.out.println("Numeros de mulheres: " + numMulheres);

    }
}


