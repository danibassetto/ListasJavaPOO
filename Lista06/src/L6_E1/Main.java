package L6_E1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome do seu cachorro: ");
        String nome = leitura.nextLine();
        System.out.println("Informe a raça do seu cachorro: ");
        String raca = leitura.nextLine();
        System.out.println("Informe a cor do seu cachorro: ");
        String cor = leitura.nextLine();

        Cachorro cachorro = new Cachorro("cachorro", cor, nome, raca);

        cachorro.exibirNomeRaca();
        cachorro.exibirTipoCor();
    }
}