package L5_E3;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao BYTE BANK!");

        //primeiro cliente e conta
        System.out.println("Informe os seguintes dados do 1º Cliente: ");

        System.out.println("Nome: ");
        String nome1 = entrada.nextLine();

        System.out.println("CPF: ");
        String cpf1 = entrada.nextLine();

        System.out.println("Endereço: ");
        String endereco1 = entrada.nextLine();

        System.out.println("Telefone: ");
        String telefone1 = entrada.nextLine();

        System.out.println("Número da conta: ");
        int numero1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Tipo de conta: ");
        String tipo1 = entrada.nextLine();

        System.out.println("Saldo: ");
        float saldo1 = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("\nCadastro realizado com sucesso!");

        // segundo cliente e conta
        Conta conta1 = new Conta(numero1, tipo1, saldo1);
        Cliente cliente1 = new Cliente(nome1.toUpperCase(), cpf1, endereco1, telefone1, conta1);

        System.out.println("\nInforme os seguintes dados do 2º Cliente: ");

        System.out.println("Nome: ");
        String nome2 = entrada.nextLine();

        System.out.println("CPF: ");
        String cpf2 = entrada.nextLine();

        System.out.println("Endereço: ");
        String endereco2 = entrada.nextLine();

        System.out.println("Telefone: ");
        String telefone2 = entrada.nextLine();

        System.out.println("Número da conta: ");
        int numero2 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Tipo de conta: ");
        String tipo2 = entrada.nextLine();

        System.out.println("Saldo: ");
        float saldo2 = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("\nCadastro realizado com sucesso!");

        Conta conta2 = new Conta(numero2, tipo2, saldo2);
        Cliente cliente2 = new Cliente(nome2.toUpperCase(), cpf2, endereco2, telefone2, conta2);

        //depósitos
        System.out.println("\nInforme o valor que deseja depositar para " + cliente1.getNome() + ":");
        float valorDep1 = entrada.nextFloat();
        conta1.depositar(valorDep1);
        System.out.println("\nValor de R$" + String.format("%.2f", valorDep1) + " depositado com sucesso na conta " + conta1.getNumero());
        System.out.println("Saldo atual: " + String.format("%.2f", conta1.getSaldo()));

        System.out.println("\nInforme o valor que deseja depositar para " + cliente2.getNome() + ":");
        float valorDep2 = entrada.nextFloat();
        conta2.depositar(valorDep2);
        System.out.println("\nValor de R$" + String.format("%.2f",valorDep2) + " depositado com sucesso na conta " + conta2.getNumero());
        System.out.println("Saldo atual: " + String.format("%.2f", conta2.getSaldo()));

        //saques
        System.out.println("\nInforme o valor que deseja sacar da conta de " + cliente1.getNome() + ":");
        float valorSaq1 = entrada.nextFloat();
        if(conta1.sacar(valorSaq1))
            System.out.println("\nValor de R$" + String.format("%.2f", valorSaq1) + " sacado com sucesso da conta " + conta1.getNumero());
        else System.out.println("\nNão é possível realizar o saque do valor informado!");
        System.out.println("Saldo atual: " + String.format("%.2f", conta1.getSaldo()));

        System.out.println("\nInforme o valor que deseja sacar da conta de " + cliente2.getNome() + ":");
        float valorSaq2 = entrada.nextFloat();
        if(conta2.sacar(valorSaq2))
            System.out.println("\nValor de R$" + String.format("%.2f", valorSaq2) + " sacado com sucesso da conta " + conta2.getNumero());
        else System.out.println("\nNão é possível realizar o saque do valor informado!");
        System.out.println("Saldo atual: " + String.format("%.2f", conta2.getSaldo()));

        //transferencia
        System.out.println("\n" + cliente1.getNome() + ", qual valor você deseja tranferir para " + cliente2.getNome() + "? ");
        float tranferencia = entrada.nextFloat();
        if(conta1.tranferir(tranferencia, conta2))
            System.out.println("\nTransferência de R$" + String.format("%.2f", tranferencia) + " realizada com sucesso!");
        else System.out.println("\nNão é possível tranferir o valor informado!");
        System.out.println("Saldo final de " + cliente1.getNome() + ": " + String.format("%.2f", conta1.getSaldo()));
        System.out.println("Saldo final de "+ cliente2.getNome() + ": " + String.format("%.2f", conta2.getSaldo()));
    }
}