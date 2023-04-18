package L6_E1;

public class Cachorro extends Animal
{
    String nome;
    String raca;

    public Cachorro(String tipo, String cor, String nome, String raca)
    {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public void exibirNomeRaca()
    {
        System.out.println(this.nome + " é da raça " + this.raca);
    }
}