package L4_E2;

public class Produto
{
    private String descricao;
    private float preco;
    private int quantidade_disponivel;
    private Fabricante fabrica;

    public Produto(String descricao, float preco, int quantidade_disponivel)
    {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade_disponivel = quantidade_disponivel;
    }

    public void repor(int quantidade)
    {
        this.quantidade_disponivel += quantidade;
    }

    public boolean vender(int quantidade)
    {
        if (quantidade <= this.quantidade_disponivel)
            return true;
        return false;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

    public float getPreco()
    {
        return this.preco;
    }

    public int getQuantidadeDisponivel()
    {
        return this.quantidade_disponivel;
    }

    public Fabricante getFabrica()
    {
        return this.fabrica;
    }

    public void setFabrica(Fabricante fabrica)
    {
        this.fabrica = fabrica;
    }
}