package L5_E4;

import java.util.Date;

public class Venda
{
    private Date data;
    private Comprador cliente;
    private Produto produto;
    private int quantidadeVendida;
    private float valorTotal;

    public Venda(Date data)
    {
        this.data = data;
    }

    public Comprador GetCliente()
    {
        return this.cliente;
    }

    public Produto GetProduto()
    {
        return this.produto;
    }

    public float GetValorTotal()
    {
        return this.valorTotal;
    }

    public void SetCliente(Comprador cliente)
    {
        this.cliente = cliente;
    }

    public boolean VenderProduto(Produto produto, int quantidade)
    {
        if (produto.Vender(quantidade))
        {
            this.produto = produto;
            this.quantidadeVendida = quantidade;
            this.valorTotal = quantidade * produto.GetPreco();
            return true;
        }
        else return false;
    }
}