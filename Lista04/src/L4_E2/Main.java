package L4_E2;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nome, endereco, telefone, descricao;
        int quantidade_disponivel;
        float preco;

        System.out.println("Informe o nome do fabricante: ");
        nome = entrada.nextLine();
        System.out.println("Informe o endereço do fabricante: ");
        endereco = entrada.nextLine();
        System.out.println("Informe o telefone do fabricante: ");
        telefone = entrada.nextLine();

        Fabricante fabricante = new Fabricante(nome, endereco, telefone);

        System.out.println("Informe a descricao do produto: ");
        descricao = entrada.nextLine();
        System.out.println("Informe o preço do produto: ");
        preco = entrada.nextFloat();
        System.out.println("Informe a quantidade disponível desse produto: ");
        quantidade_disponivel = entrada.nextInt();

        Produto produto = new Produto(descricao, preco, quantidade_disponivel);

        produto.setFabrica(fabricante);
        System.out.println("Telefone do fabricante do produto" + produto.getDescricao() + ": " + produto.getFabrica().getTelefone());

        System.out.println("Informe um novo telefone: ");
        telefone = entrada.next();

        fabricante.setFone(telefone);

        System.out.println("Novo telefone do fabricante do produto" + produto.getDescricao() + ": " + produto.getFabrica().getTelefone());
    }
}