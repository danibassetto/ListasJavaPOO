package L6_E2;

public class Main
{
    /*defina o método main declarando três objetos e1, e2, e e3 da classe
Empregado, instancie e1 como Vendedor, e2 como Gerente e e3 como Horista. Exiba o
número, o nome e o valor do salário do empregado que possuir o maior salári*/
    public static void main(String[] args)
    {
        Vendedor e1 = new Vendedor(1500, 20000, 10);
        Gerente e2 = new Gerente(4000);
        Horista e3 = new Horista(50, 100);

        float s1 = e1.getSalario();
        float s2 = e2.getSalario();
        float s3 = e3.getSalario();

        if(s1 > s2 && s1 > s3)
            System.out.println(e1.getNome() + " recebe o maior salário: R$" + String.format("%.2f", s1));
        else if (s2 > s3)
            System.out.println(e2.getNome() + " recebe o maior salário: R$" + String.format("%.2f", s2));
        else
            System.out.println(e3.getNome() + " recebe o maior salário: R$" + String.format("%.2f", s3));
    }
}