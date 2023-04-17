package L5_E1;

import java.util.Vector;

public class Motorista
{
    private String cnh, categoria, nome;
    private Veiculo carro;

    public Motorista(String cnh, String categoria, String nome)
    {
        this.cnh = cnh;
        this.categoria = categoria;
        this.nome = nome;
    }

    public String GetCNH()
    {
        return this.cnh;
    }

    public String GetNome()
    {
        return this.nome;
    }

    public String GetCategoria()
    {
        return this.categoria;
    }

    public Veiculo GetCarro()
    {
        return this.carro;
    }

    public void SetCarro(Veiculo carro)
    {
        this.carro = carro;
    }
}