import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String estados[] = new String[10];
        String busca, elemento = "";
        boolean encontrou;
        int i;

        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        System.out.print("ESTADOS: ");
        for (i = 0; i < 10; i++){
            System.out.print(estados[i] + " ");
        }
        System.out.println();

        System.out.print("BUSCAR ESTADO: ");
        busca = sc.nextLine();

        //BUSCA LINEAR

        encontrou = false;

        for (i = 0; i < 10; i++){
            elemento = estados[i];
            if (elemento.equals(busca)){ // ISSO COMPARA STRING EM JAVA
                encontrou = true;
                break;
            }
        }
        if (encontrou == true){
            System.out.println("ESTADO " + elemento + " ENCONTARDO!");
        }else {
            System.out.println("ESTADO NÃO ENCONTRADO!");
        }
    }
}