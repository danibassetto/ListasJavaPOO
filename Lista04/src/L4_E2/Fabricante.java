package L4_E2;

public class Fabricante
{
    private String nome, endereco, telefone;

    public Fabricante(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setFone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getTelefone()
    {
        return this.telefone;
    }
}
