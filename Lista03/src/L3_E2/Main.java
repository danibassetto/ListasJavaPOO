package L3_E2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int h, m, s;

        System.out.println("Informe as horas: ");
        h = entrada.nextInt();
        System.out.println("Informe os minutos: ");
        m = entrada.nextInt();
        System.out.println("Informe os segundos: ");
        s = entrada.nextInt();

        Horario horario = new Horario(h, m, s);
        System.out.println("\n" + horario.getHorario());
        System.out.println("Horário em segundos = " + horario.horarioEmSegundos() + "s");

        horario.somaHorario(3000);
        System.out.println("\n" + horario.getHorario());
        System.out.println("Horário em segundos = " + horario.horarioEmSegundos() + "s");
    }
}