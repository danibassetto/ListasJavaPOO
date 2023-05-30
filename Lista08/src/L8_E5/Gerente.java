package L8_E5;

public class Gerente extends Empregado
{
    private float salarioMensal;

    public Gerente(int nro, String nome)
    {
        super(nro, nome);
    }

    public void setSalarioMensal(float salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }

    public float getSalario()
    {
        return this.salarioMensal;
    }
}