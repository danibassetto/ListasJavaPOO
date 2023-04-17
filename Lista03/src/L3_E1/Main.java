package L3_E1;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        float m1, m2;
        System.out.println("Informe um número inteiro: ");
        n1 = entrada.nextInt();
        System.out.println("Informe um número inteiro: ");
        n2 = entrada.nextInt();

        Calculadora calculadora = new Calculadora(n1, n2);

        System.out.println("\nSoma = " + calculadora.retornaSoma());
        System.out.println("Multiplicação = " + calculadora.retornaMultiplicacao());

        System.out.println("\nInforme um número float: ");
        m1 = entrada.nextFloat();
        System.out.println("Informe um número float: ");
        m2 = entrada.nextFloat();

        calculadora.setaNumeros(m1, m2);
        //calculadora.setaNumeros((float)n1, (float)n2);
        //calculadora.setaNumeros(2.1f, 2.3f);

        System.out.println("\nSoma = " + calculadora.retornaSoma());
        System.out.println("Multiplicação = " + calculadora.retornaMultiplicacao());
    }
}