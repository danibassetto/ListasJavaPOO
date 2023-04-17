package L2_E4;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String descricao;
        float preco;
        int opcao;

        System.out.println("Informe a descrição do produto: ");
        descricao = teclado.nextLine();
        System.out.println("Informe o preço do produto: ");
        preco = teclado.nextFloat();

        Produto produto = new Produto(descricao, preco);

        do
        {
            System.out.print("\nInforme uma opção: " +
                    "\n1 – Repor estoque" +
                    "\n2 – Vender" +
                    "\n3 – Exibir dados do produto" +
                    "\n4 – Finalizar" +
                    "\n>>>>> ");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Informe a quantidade reposta do produto: ");
                    if(produto.Repor(teclado.nextInt()))
                        System.out.println("Estoque reposto com sucesso.");
                    else System.out.println("Quantidade inválida!");
                    break;
                case 2:
                    System.out.println("Informe a quantidade vendida: ");
                    if(produto.Vender(teclado.nextInt()))
                        System.out.println("Venda realizada com sucesso!");
                    else System.out.println("Quantidade inválida!");
                    break;
                case 3:
                    produto.ExibirDados();
            }
        } while(opcao != 4);
    }
}