package L6_E2;

public class Horista extends Empregado
{
    float valorHora;
    int totalHorasTrabalhadas;

    public Horista(float valorHora, int totalHorasTrabalhadas)
    {
        this.valorHora = valorHora;
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    public float getSalario()
    {
        return this.totalHorasTrabalhadas * this.valorHora;
    }
}