/*Desenvolva um programa que retire todas as vogais da frase “Bacharelado em Ciência da
Computação” e exiba-a novamente.*/

public class L1_E08 {
	public static void main(String[] args) {
		String curso = "Bacharelado em Ciencia da Computacao", curso2 = "";
		int vogais = 0;

		for(int i = 0; i < curso.length(); i++)
		{
			if (!(curso.charAt(i) == 'a' ||
					curso.charAt(i) == 'e' ||
					curso.charAt(i) == 'i' ||
					curso.charAt(i) == 'o' ||
					curso.charAt(i) == 'u'))
				curso2 += curso.charAt(i);
		}
		System.out.println("Frase sem vogais: " + curso2);
	}
}
