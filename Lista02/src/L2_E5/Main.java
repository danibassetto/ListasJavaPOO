package L2_E5;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String ra, nome;
        float p1, p2;

        System.out.println("Informe o RA do(a) aluno(a): ");
        ra = teclado.nextLine();
        System.out.println("Informe o nome do(a) aluno(a): ");
        nome = teclado.nextLine();

        Aluno aluno = new Aluno(ra, nome);

        System.out.println("Informe a nota da 1ª prova: ");
        p1 = teclado.nextFloat();
        System.out.println("Informe a nota da 2ª prova: ");
        p2 = teclado.nextFloat();

        aluno.AtribuirNotas(p1, p2);

        System.out.printf("\nMédia de " + nome + " RA: " + ra + " = " + aluno.CalcularMedia());
        System.out.println("\nSituação: " + aluno.VerificaSituacao());
    }
}