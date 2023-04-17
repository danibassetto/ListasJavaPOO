/*
Desenvolva um programa que conte quantas vogais fazem parte da frase “Bacharelado em Ciência
da Computação” e exiba este valor.
*/

public class L1_E07 {
	public static void main(String[] args) {
		String curso = "Bacharelado em Ciencia da Computacao";
		int vogais = 0;

		for(int i = 0; i < curso.length(); i++)
		{
			if(curso.charAt(i) == 'a' ||
				curso.charAt(i) == 'e' ||
				curso.charAt(i) == 'i' ||
			 	curso.charAt(i) == 'o' ||
				curso.charAt(i) == 'u')
			{
				vogais++;
			}
		}
		System.out.println("Quantidade de vogais: " + vogais);
	}
}
