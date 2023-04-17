/*Desenvolva um programa que inicialize um vetor de 10 números inteiros com seguintes números
{5, 7, 9, 11, 6, 4, 8, 16, 13, 1} e exiba os números localizados nas posições ímpares (lembre-se que
num vetor de 10 posições os índices são entre 0 e 9)*/

public class L1_E05
{
	public static void main(String[] args)
	{
		int vetor[] = {5, 7, 9, 11, 6, 4, 8, 16, 13, 1};
		for(int i = 0; i < 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(vetor[i]);
			}
		}
	}
}
