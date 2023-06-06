package L9_E2;

public class Homem extends PessoaIMC
{
    private String time;

    public Homem(String nome, int idade, float peso, float altura, String time)
    {
        super(nome, idade, peso, altura);
        this.time = time;
    }

    public String getTime()
    {
        return this.time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String resultadoIMC() {
        if(calcularIMC() < 20.7)
            return "Abaixo do peso ideal";
        else if(20.7 < calcularIMC() && calcularIMC() < 26.4)
            return "Peso ideal";
        else
            return "Acima do peso ideal";
    }
}