package L9_E2;

public class Main
{
    public static void main(String[] args)
    {
        Homem joao = new Homem("João", 23, 75, 1.80f, "São Paulo");
        Mulher maria = new Mulher("Maria", 25, 60, 1.70f, "Escorpião");

        System.out.println("Nome: " + joao.getNome() +
                            "\nIMC: " + joao.calcularIMC() +
                            "\nCondição: " + joao.resultadoIMC());

        System.out.println("Nome: " + maria.getNome() +
                            "\nIMC: " + maria.calcularIMC() +
                            "\nCondição: " + maria.resultadoIMC());

        if(joao.getPeso() > maria.getPeso())
            System.out.println("Pessoa mais pesada: " + joao.getNome() + " com " + joao.getPeso() + "KG");
        else
            System.out.println("Pessoa mais pesada: " + maria.getNome() + " com " + maria.getPeso() + "KG");

        if(joao.getPeso() > maria.getPeso())
            System.out.println("Pessoa mais alta: " + joao.getNome() + " com " + joao.getAltura() + "m de altura");
        else
            System.out.println("Pessoa mais alta: " + maria.getNome() + " com " + maria.getAltura() + "m de altura");
    }
}