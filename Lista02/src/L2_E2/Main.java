package L2_E2;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		p.nome = leitura.next();
		System.out.println("Informe sua idade: ");
		p.idade = leitura.nextInt();
		System.out.println("Informe seu telefone: ");
		p.telefone = leitura.next();

		System.out.println("Informações pessoais (ANTES):" +
				"\nNome: " + p.nome +
				"\nIdade: " + p.idade +
				"\nTelefone: " + p.telefone);

		p.fazAniversario();
		p.atualizaTelefone("3344-5555");

		System.out.println("\nInformações pessoais (DEPOIS):" +
				"\nNome: " + p.nome +
				"\nIdade: " + p.idade +
				"\nTelefone: " + p.telefone);

	}
}
