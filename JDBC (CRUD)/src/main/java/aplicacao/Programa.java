package aplicacao;

import DAO.JogadorDAO;
import java.util.Scanner;
import DTO.JogadorDTO;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;
        JogadorDAO jogador_dao = new JogadorDAO();
        
        System.out.println("------------------");
        System.out.println("[1] - INSERIR");
        System.out.println("[2] - LER");
        System.out.println("[3] - ALTERAR");
        System.out.println("[4] - DELETAR");
        System.out.println("------------------");
        System.out.print("OPCAO: ");
        op = sc.nextInt();

        System.out.println();

        switch (op) {
            case 1:
                System.out.print("Numero: ");
                int numCamisa = sc.nextInt();

                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Posicao: ");
                String posicao = sc.nextLine();

                System.out.print("Clube: ");
                String clube = sc.nextLine();

                JogadorDTO jogador_dto = new JogadorDTO(numCamisa, nome, posicao, clube);

                jogador_dao.inserir(jogador_dto);

                break;
            case 2:
                System.out.println("DADOS DO BANCO: ");
                jogador_dao.ler();
                break;

            case 3:
                System.out.println("Transferir Jogador: ");
                sc.nextLine();
                System.out.print("Novo Clube: ");
                String novoClube = sc.nextLine();
                System.out.print("Numero do Jogador: ");
                int numero = sc.nextInt();

                jogador_dao.alterar(novoClube, numero);

                break;
                
            case 4:
                System.out.print("Deletar Jogador (CAMISA): ");
                int idJogador = sc.nextInt();

                jogador_dao.deletar(idJogador);
                
                break;
                
            case 0:
                System.out.println("SAIU!");
                break;
                
            default:
                System.out.println("OPÇÃO INVALIDA!");
                break;
        }
        
    }
}
