package L9_E2;

abstract class PessoaIMC extends Pessoa
{
    private float peso, altura;

    public PessoaIMC(String nome, int idade, float peso, float altura)
    {
        super(nome, idade);
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso()
    {
        return this.peso;
    }

    public float getAltura()
    {
        return this.altura;
    }

    public float calcularIMC()
    {
        return this.peso / (this.altura * this.altura);
    }

    public abstract String resultadoIMC();
}