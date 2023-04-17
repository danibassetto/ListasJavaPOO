package L5_E2;

public class Funcionario
{
    private int codigo;
    private String nome;
    private float salario;
    private Departamento departamento;

    public Funcionario(int codigo, String nome, float salario)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int GetCodigo()
    {
        return this.codigo;
    }

    public String GetNome()
    {
        return this.nome;
    }

    public float GetSalario()
    {
        return this.salario;
    }

    public Departamento GetDepartamento()
    {
        return this.departamento;
    }

    public void SetSalario(float salario)
    {
        this.salario = salario;
    }

    public void SetDepartamento(Departamento departamento)
    {
        this.departamento = departamento;
    }
}