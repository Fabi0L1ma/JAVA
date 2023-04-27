import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        float preco = 0, remover_ADD_Preco = 0,  valorEmEstoque = 0;
        int add_rem = 0, qtdEstoque;

        System.out.print("Digite o nome do produto: ");
        nome = sc.next();
        System.out.print("Preco do produto: ");
        preco = sc.nextFloat();
        System.out.print("QTD do produto: ");
        qtdEstoque = sc.nextInt();

        valorEmEstoque = preco * qtdEstoque;

        System.out.println("Dados do produto: " + nome + ", R$" + preco + ", " + qtdEstoque + " unidades, " + "Total: R$" + valorEmEstoque);

        System.out.print("Informe numero de produtos a serem adicionados no estoque: ");
        add_rem = sc.nextInt();

        qtdEstoque += add_rem;
        remover_ADD_Preco = add_rem * preco;
        valorEmEstoque = valorEmEstoque + remover_ADD_Preco;

        System.out.println("Dados atualizados: " + nome + ", R$" + preco + ", " + qtdEstoque + ", " + "Total: " + valorEmEstoque);

        System.out.print("Informe o numero de produtos a serem adicionados no estoque: ");
        add_rem = sc.nextInt();

        qtdEstoque -= add_rem;
        remover_ADD_Preco = add_rem * preco;
        valorEmEstoque = valorEmEstoque - remover_ADD_Preco;

        System.out.println("Dados atualizados: " + nome + ", R$" + preco + ", " + qtdEstoque + ", " + "Total: " + valorEmEstoque);

    }
}


