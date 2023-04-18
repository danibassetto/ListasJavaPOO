package L6_E2;

public class Vendedor extends Empregado
{
    float salarioBase;
    float valorVendaMes;
    float percentagemComissao;

    public Vendedor(float salarioBase, float valorVendaMes, float percentagemComissao)
    {
        this.salarioBase = salarioBase;
        this.valorVendaMes = valorVendaMes;
        this.percentagemComissao = percentagemComissao;
    }

    public float getSalario()
    {
        return this.salarioBase + (this.valorVendaMes * (this.percentagemComissao / 100));
    }
}