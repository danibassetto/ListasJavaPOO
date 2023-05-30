package L8_E5;

public class Horista extends Empregado
{
    private float valorHora;
    private int horasTrabalhadas;
    public Horista(int nro, String nome)
    {
        super(nro, nome);
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
}