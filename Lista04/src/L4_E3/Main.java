package L4_E3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int codigo, cargaHoraria;
        String nome, nomeprof, titulacao, formacao;

        System.out.println("Informe o código da disciplina: ");
        codigo = teclado.nextInt();
        System.out.println("Informe o nome da disciplina: ");
        nome = teclado.nextLine();
        System.out.println("Informe a carga horária da disciplina: ");
        cargaHoraria = teclado.nextInt();

        Disciplina disciplina = new Disciplina(codigo, nome, cargaHoraria);

        System.out.println("Informe o nome do professor: ");
        nomeprof = teclado.nextLine();
        System.out.println("Informe a formação do professor: ");
        formacao = teclado.nextLine();
        System.out.println("Informe a titulação do professor: ");
        titulacao = teclado.nextLine();

        Professor professor = new Professor(nomeprof, formacao, titulacao);

        disciplina.setProfessor(professor);

        System.out.println("A disciplina " + disciplina.getNome() + "é ministrada pelo professor"
        + disciplina.getProfessor().getNome());
    }
}