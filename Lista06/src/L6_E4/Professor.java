package L6_E4;

public class Professor extends Funcionario
{
    private String formacao;

    public Professor(String nome, String sobrenome, int nroMatricula, float salario, String formacao)
    {
        super(nome, sobrenome, nroMatricula, salario);
        this.formacao = formacao;
    }

    public String getFormacao()
    {
        return this.formacao;
    }

    public float getPrimeiraParcelaSalario()
    {
        return super.getPrimeiraParcelaSalario() + super.getSegundaParcelaSalario();
    }

    public float getSegundaParcelaSalario()
    {
        return 0;
    }
}