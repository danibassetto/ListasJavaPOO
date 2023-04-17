package L4_E1;

public class Cartao
{
    private String senha;

    public Cartao(String senha)
    {
        this.senha = senha;
    }

    public boolean VerificaSenha(String senha)
    {
        return this.senha.equals(senha);
    }
}
