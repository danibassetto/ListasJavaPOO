package L8_E2;

public class Main
{
    public static void main(String[] args)
    {
        PagamentoBoleto pb = new PagamentoBoleto(1000);
        PagamentoCartao pc = new PagamentoCartao(900, "Crédito");

        pb.exibirRecibo();
        pc.exibirRecibo();
    }
}