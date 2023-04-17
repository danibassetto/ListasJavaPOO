package L5_E4;
public class Produto
{
    private String descricao;
    private float preco;
    private int quantidadeDisponivel;

    public Produto(String descricao, float preco, int quantidadeDisponivel)
    {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String GetDescricao()
    {
        return this.descricao;
    }

    public float GetPreco()
    {
        return this.preco;
    }

    public int GetQuantidadeDisponivel()
    {
        return this.quantidadeDisponivel;
    }

    public void Repor(int quantidade)
    {
        this.quantidadeDisponivel += quantidade;
    }

    public boolean Vender(int quantidadeVendida)
    {
        if(quantidadeVendida <= this.quantidadeDisponivel)
        {
            this.quantidadeDisponivel -= quantidadeVendida;
            return true;
        }
        else return false;
    }
}