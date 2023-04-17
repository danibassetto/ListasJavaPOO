package L5_E2;

public class Main
{
    public static void main(String[] args)
    {
        float maiorSalario;

        Departamento departamento1 = new Departamento(1, "Financeiro", "FIN");
        Departamento departamento2 = new Departamento(2, "Desenvolvimento", "DEV");

        Funcionario funcionario1 = new Funcionario(1, "João da Silva", 1589.95f);
        Funcionario funcionario2 = new Funcionario(2, "Danielle", 3600.00f);

        funcionario1.SetDepartamento(departamento1);
        funcionario2.SetDepartamento(departamento2);

        if(funcionario1.GetSalario() > funcionario2.GetSalario())
            maiorSalario = funcionario1.GetSalario();
        else
            maiorSalario = funcionario2.GetSalario();

        System.out.println("Funcionário 1: " + funcionario1.GetNome() + " - Departamento: " +  funcionario1.GetDepartamento().GetNome() +
                "\nFuncionário 2: " + funcionario2.GetNome() + " - Departamento: " +  funcionario2.GetDepartamento().GetNome() +
                        "\nMaior salário: " + maiorSalario);
    }
}