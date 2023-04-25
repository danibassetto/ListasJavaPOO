package L6_E3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int nro;
        MaiorMenor m = new MaiorMenor();

        do
        {
            System.out.println("Digite um nro inteiro positivo (-1 para encerrar): ");
            nro = teclado.nextInt();
            if(nro <= -1)
                break;
            m.processaValor(nro);
        } while(true);

        System.out.println("Maior valor = " + m.getMaiorValor());
        System.out.println("Menor valor = " + m.getMenorValor());
        System.out.println("Média aritmética = " + m.mediaAtual());

        System.out.println();
    }
}