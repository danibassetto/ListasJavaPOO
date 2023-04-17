package L2_E3;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int opcao, numeroConta;
		String nomeTitular;

		System.out.println("Bem vindo ao ByteBank!! \nInforme seu nome completo:");
		nomeTitular = entrada.nextLine();
		System.out.println("Informe o número de sua conta: ");
		numeroConta = entrada.nextInt();

		Conta cliente = new Conta(nomeTitular, numeroConta);

		do
		{
			System.out.print("\nInforme uma opção: " +
					"\n1 – Depósito" +
					"\n2 – Saque" +
					"\n3 – Consultar Saldo" +
					"\n4 – Finalizar" +
					"\n>>>>> ");
			opcao = entrada.nextInt();

			switch (opcao)
			{
				case 1:
					System.out.print("\nInsira o valor de depósito: ");
					if(cliente.depositar(entrada.nextFloat()))
					{
						System.out.print("\nDepósito efetuado com sucesso!\n");
					}
					else System.out.println("\nError: não é possível depositar este valor.\n");
					break;
				case 2:
					System.out.print("\nInforme o valor de saque: ");
					if(cliente.sacar(entrada.nextFloat()))
					{
						System.out.print("\nSaque efetuado com sucesso!\n");
					}
					else System.out.print("\nSaldo indisponível.\n");
					break;
				case 3:
					System.out.printf("\nNome titular: " + cliente.GetNomeTitular() +
										"\nNúmero da conta: " + cliente.GetNumeroConta() +
										"\nSaldo da conta: R$ " + String.format("%.2f", cliente.GetSaldo()) + "\n");
					break;
			}

		} while(opcao != 4);

		System.out.println("\nAguarde... ");
		Thread.sleep(2000);
		System.out.println("Programa finalizado");
	}
}