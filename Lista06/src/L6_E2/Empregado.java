package L6_E2;

import java.util.Scanner;

public class Empregado
{
    int numero;
    String nome;

    public Empregado()
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Número do empregado: ");
        this.numero = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Nome do empregado: ");
        this.nome = leitura.nextLine();
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getNumero()
    {
        return this.numero;
    }
}