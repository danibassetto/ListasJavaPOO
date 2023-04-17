import java.util.Scanner;

class Conta {
    private int numero;
    private String tipo;
    private float saldo;

    public Conta(int numero, String tipo, float saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else return false;
    }

    public boolean tranferir(float valor, Conta destino) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else return false;
    }
}

class Cliente
{
    private String nome, cpf, endereco, telefone;
    private Conta conta;

    public Cliente(String nome, String cpf, String endereco, String telefone, Conta conta)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.conta = conta;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public String getEndereco()
    {
        return this.endereco;
    }

    public String getTelefone()
    {
        return this.telefone;
    }

    public Conta getConta()
    {
        return this.conta;
    }
}

class Main
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