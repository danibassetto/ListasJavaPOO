package L4_E3;

public class Professor
{
    private String nome, formacao, titulacao;

    public Professor(String nome, String formacao, String titulacao)
    {
        this.nome = nome;
        this.formacao = formacao;
        this.titulacao = titulacao;
    }

    public String getNome()
    {
        return this.nome;
    }
}