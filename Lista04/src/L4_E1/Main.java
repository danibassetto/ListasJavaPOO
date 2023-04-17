package L4_E1;
import java.util.Scanner;

public class Main
{
	public static boolean confereSenha(Cartao cartao, Scanner teclado)
	{
		System.out.println("Digite a senha: ");
		String senha = teclado.next();
		return cartao.VerificaSenha(senha);
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int opcao, numeroConta;
		String nomeTitular, senha;

		System.out.println("Bem vindo ao ByteBank!! \nInforme seu nome completo:");
		nomeTitular = entrada.nextLine();
		System.out.println("Informe o número de sua conta: ");
		numeroConta = entrada.nextInt();
		System.out.println("Informe uma senha: ");
		senha = entrada.next();

		Conta cliente = new Conta(nomeTitular, numeroConta, senha);

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
					if(confereSenha(cliente.GetCartao(), entrada))
					{
						System.out.print("\nInsira o valor de depósito: ");
						if(cliente.depositar(entrada.nextFloat()))
							System.out.print("\nDepósito efetuado com sucesso!\n");
						else System.out.println("\nError: não é possível depositar este valor.\n");
					}
					else System.out.println("Senha incorreta!");
					break;
				case 2:
					if(confereSenha(cliente.GetCartao(), entrada))
					{
						System.out.print("\nInforme o valor de saque: ");
						if (cliente.sacar(entrada.nextFloat()))
							System.out.print("\nSaque efetuado com sucesso!\n");
						else System.out.print("\nSaldo indisponível.\n");
					}
					else System.out.println("Senha incorreta!");
					break;
				case 3:
					if(confereSenha(cliente.GetCartao(), entrada))
						System.out.printf("\nNome titular: " + cliente.GetNomeTitular() +
								"\nNúmero da conta: " + cliente.GetNumeroConta() +
								"\nSaldo da conta: R$ " + String.format("%.2f", cliente.GetSaldo()) + "\n");
					else System.out.println("Senha incorreta!");
					break;
			}

		} while(opcao != 4);

		System.out.println("\nAguarde... ");
		Thread.sleep(2000);
		System.out.println("Programa finalizado");
	}
}