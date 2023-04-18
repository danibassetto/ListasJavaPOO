package L6_E1;

public class Animal
{
    String tipo;
    String cor;

    public Animal(String tipo, String cor)
    {
        this.tipo = tipo;
        this.cor = cor;
    }

    public void exibirTipoCor()
    {
        System.out.println("Eu sou " + this.tipo + " " + this.cor);
    }
}