/*Desenvolva um programa que some todos os números divisíveis por 2, 5 e 7 ao mesmo tempo de 1
a 1000 e exiba o resultado. */

public class L1_E04 {
    public static void main(String[] args) {
        System.out.println("Soma dos números divisíveis por 2, 5 e 7 de 1 a 1000:");
        int soma = 0;
        for(int i = 1; i <= 1000; i++)
        {
            if(i % 2 == 0 & i % 5 == 0 & i % 7 == 0)
            {
                soma += i;
            }
        }
        System.out.print(soma);
    }
}
