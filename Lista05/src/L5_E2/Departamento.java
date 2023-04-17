package L5_E2;

public class Departamento
{
    private int codigo;
    private String nome, sigla;

    public Departamento(int codigo, String nome, String sigla)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int GetCodigo()
    {
        return this.codigo;
    }

    public String GetNome()
    {
        return this.nome;
    }

    public String GetSigla()
    {
        return this.sigla;
    }
}