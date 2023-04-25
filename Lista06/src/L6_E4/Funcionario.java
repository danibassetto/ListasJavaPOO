package L6_E4;

public class Funcionario extends Pessoa
{
    private int nroMatricula;
    private float salario;

    public Funcionario(String nome, String sobrenome, int nroMatricula, float salario) {
        super(nome, sobrenome);
        this.nroMatricula = nroMatricula;
        this.salario = salario;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public float getPrimeiraParcelaSalario()
    {
        return this.salario * 0.6f;
    }

    public float getSegundaParcelaSalario()
    {
        return this.salario * 0.4f;
    }

    public int getNroMatricula()
    {
        return this.nroMatricula;
    }

    public float getSalario()
    {
        return this.salario;
    }
}