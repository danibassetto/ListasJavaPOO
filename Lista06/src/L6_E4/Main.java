package L6_E4;

public class Main
{
    public static void main(String[] args)
    {
        Professor p = new Professor("Adriano", "Nakamura", 14789, 2000, "Ciência da Computação");

        Funcionario f = new Funcionario("José", "da Silva", 12678, 3000);

        System.out.println("Professor: " + p.getNomeCompleto() + " - salário: \n1ªParcela: R$" + String.format("%.2f", p.getPrimeiraParcelaSalario()) + "\n2ªParcela: R$" + String.format("%.2f", p.getSegundaParcelaSalario()));
        System.out.println("Funcionário: " + f.getNomeCompleto() + " - salário: \n1ªParcela: R$" + String.format("%.2f",f.getPrimeiraParcelaSalario()) + "\n2ªParcela: R$" + String.format("%.2f",f.getSegundaParcelaSalario())) ;
    }
}