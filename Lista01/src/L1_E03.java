/*Desenvolva um programa que exiba todos os números divisíveis por 3 e 4 entre 1 a 1000.*/

public class L1_E03 {
    public static void main(String[] args) {
        System.out.println("Números divisíveis por 3 e 4 de 1 a 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            if(i % 3 == 0 && i % 4 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
