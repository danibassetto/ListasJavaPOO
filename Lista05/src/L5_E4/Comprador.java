package L5_E4;

public class Comprador
{
    private String nome, endereco, telefone;

    public Comprador(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String GetNome()
    {
        return this.nome;
    }

    public String GetEndereco()
    {
        return this.endereco;
    }

    public String GetTelefone() {
        return this.telefone;
    }
}