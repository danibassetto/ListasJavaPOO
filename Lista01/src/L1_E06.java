/*Desenvolva um programa que leia através do teclado uma matriz 4x4 de valores inteiros e exiba a
soma dos elementos da diagonal principal.*/

import java.util.Scanner;

public class L1_E06
{
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.println("Vetor[" + (i + 1) + "][" + (j + 1) + "] : ");
				matriz[i][j] = teclado.nextInt();
			}
		}

		int soma = 0;
		System.out.println("MATRIZ");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(matriz[i][j] + " ");
			}
			soma += matriz[i][i];
			System.out.printf("\n");
		}
		System.out.println("Soma da diagonal principal = " + soma);
	}
}
