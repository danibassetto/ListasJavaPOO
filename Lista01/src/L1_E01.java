import java.util.Scanner;

public class L1_E01 {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe o custo do produto: ");
        double custo_produto = leitura.nextDouble();
        double lucro = custo_produto + custo_produto * 0.0;
        double imposto = custo_produto - custo_produto * 0.2695;
        double venda = custo_produto - imposto + lucro;
        System.out.println("Valor de venda: R$" + venda);
    }
}
