package L8_E2;

public class PagamentoCartao implements Pagamento
{
    private float valor;
    private String tipo;

    public PagamentoCartao(float valor, String tipo)
    {
        this.valor = valor;
        this.tipo = tipo;
    }

    public float calcularValorPagto()
    {
        return this.valor;
    }

    public void exibirRecibo()
    {
        System.out.println("Valor pago por cartão de " + this.tipo + ": R$ " + this.valor);
    }
}