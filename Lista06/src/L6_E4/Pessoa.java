package L6_E4;

import java.util.Scanner;

public class Pessoa
{
    private String nome, sobrenome;

    public Pessoa()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome da pessoa: ");
        this.nome = teclado.next();
        System.out.println("Sobrenome da pessoa: ");
        this.sobrenome = teclado.next();
    }

    public Pessoa(String nome, String sobrenome)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome()
    {
        return this.sobrenome;
    }

    public String getNomeCompleto()
    {
        return this.nome + " " + this.sobrenome;
    }
}