package L8_E2;

public class PagamentoBoleto implements Pagamento
{
    private float valor;

    public PagamentoBoleto(float valor)
    {
        this.valor = valor;
    }

    public float calcularValorPagto()
    {
        return this.valor;
    }

    public void exibirRecibo()
    {
        System.out.println("Valor pago por Boleto: R$ " + this.valor);
    }
}