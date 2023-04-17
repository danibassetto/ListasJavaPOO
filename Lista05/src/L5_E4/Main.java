package L5_E4;

public class Main
{
    public static void main(String[] args) {
        Comprador c=new Comprador("João da Silva", "endereco",
                "telefone");
        Produto p=new Produto("mouse optico wireless", 50, 10);
        Venda v=new Venda (new java.util.Date());
        v.SetCliente(c);
        if(v.VenderProduto(p, 11))
            System.out.println("Venda realizada!\n"+
                    "Produto vendido: " + v.GetProduto().GetDescricao() +
                    "\nValor total: R$ " + v.GetValorTotal());
        else
            System.out.println("Qtde insuficiente!");
    }
}