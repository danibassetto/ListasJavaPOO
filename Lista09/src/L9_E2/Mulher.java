package L9_E2;

public class Mulher extends PessoaIMC
{
        private String signo;

    public Mulher(String nome, int idade, float peso, float altura, String signo)
    {
        super(nome, idade, peso, altura);
        this.signo = signo;
    }

    public String getSigno()
    {
        return this.signo;
    }

    public void setSigno(String signo)
    {
        this.signo = signo;
    }

    public String resultadoIMC() {
        if(calcularIMC() < 19)
            return "Abaixo do peso ideal";
        else if(19 < calcularIMC() && calcularIMC() <  25.8)
            return "Peso ideal";
        else
            return "Acima do peso ideal";
    }
}