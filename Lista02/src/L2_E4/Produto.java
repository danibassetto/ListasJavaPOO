package L2_E4;

public class Produto
{
    private String descricao;
    private float preco;
    private int qtde_disp;
    private int qtde_vend;

    public Produto(String descricao, float preco)
    {
        this.descricao = descricao;
        this.preco = preco;
    }

    public boolean Repor(int qtde)
    {
        if(qtde > 0)
        {
            this.qtde_disp += qtde;
            return true;
        }
        return false;
    }

    public boolean Vender(int qtde)
    {
        if(qtde_disp >= qtde)
        {
            qtde_disp -= qtde;
            qtde_vend += qtde;
            return true;
        }
        else return false;
    }

    public void ExibirDados()
    {
        System.out.println("\n====== DADOS DO PRODUTO ======\n");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade disponível: " + this.qtde_disp);
        System.out.println("Quantidade vendida: " + this.qtde_vend);
    }
}
