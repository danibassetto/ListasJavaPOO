/*Desenvolva um programa que leia através do teclado o sexo (“m” ou “f”) e a altura, calcule e exiba
o seu peso ideal em função (atribuídos às respectivas variáveis), de acordo com as fórmulas:
• P/ homem – peso ideal = 72.7*.altura – 58
• P/ mulher – peso ideal = 62.1*altura – 44.7*/

import java.util.Scanner;

public class L1_E02 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu sexo [M/F] ");
        String sexo = teclado.next().toUpperCase();
        System.out.println("Informe a altura: ");
        float altura = teclado.nextFloat();
        if(sexo.equals("M"))
            System.out.println("Seu peso ideal é " + (72.7 * altura - 58));
        else if (sexo.equals("F"))
            System.out.printf("Seu peso ideal é %.2f", (62.1 * altura - 44.7));
        else System.out.println("Sexo inválido!!");
    }
}
