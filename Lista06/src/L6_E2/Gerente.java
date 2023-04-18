package L6_E2;

public class Gerente extends Empregado
{
    float salarioMensal;

    public Gerente(float salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }

    public float getSalario()
    {
        return this.salarioMensal;
    }
}