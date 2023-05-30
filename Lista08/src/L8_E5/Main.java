package L8_E5;

public class Main
{
    public static void main(String[] args)
    {
        Vendedor e1 = new Vendedor(1, "José");
        e1.setSalarioBase(2000);
        e1.setTotalVendasMes(30000);
        e1.setPercComissao(10);

        Gerente e2 = new Gerente(2, "Maria");
        e2.setSalarioMensal(4000);
        Horista e3 = new Horista(3, "Mário");
        e3.setValorHora(50);
        e3.setHorasTrabalhadas(200);

        System.out.println("Nro: " + e1.getNro() + "\nNome: " +
                e1.getNome() + "\nSalario: " + e1.getSalario());

        System.out.println("Nro: " + e2.getNro() + "\nNome: " +
                e2.getNome() + "\nSalario: " + e2.getSalario());

        System.out.println("Nro: " + e3.getNro() + "\nNome: " +
                e3.getNome() + "\nSalario: " + e3.getSalario());

        float s1 = e1.getSalario();
        float s2 = e2.getSalario();
        float s3 = e3.getSalario();


    }
}