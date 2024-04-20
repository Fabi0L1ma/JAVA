package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

    public static void main(String[] args) {
        
        String caminho = "c:\\temp\\texto.txt";
       
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            
            String linha = br.readLine(); // LER LINHAS
            
            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
