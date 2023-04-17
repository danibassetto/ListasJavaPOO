import java.util.Scanner;

public class L1_E09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		String invertido = "";

		for(int i = 0; i < frase.length(); i++)
			invertido = frase.charAt(i) + invertido;

		System.out.println(invertido);
	}
}
