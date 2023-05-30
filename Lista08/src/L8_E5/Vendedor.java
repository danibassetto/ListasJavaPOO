package L8_E5;

public class Vendedor extends Empregado
{
    private float salarioBase;
    private float totalVendasMes;
    private float percComissao;

    public Vendedor(int nro, String nome) {
        super(nro, nome);
    }

    public void setSalarioBase(float salarioBase)
    {
        this.salarioBase = salarioBase;
    }

    public void setTotalVendasMes(float totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }

    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }

    public float getSalario()
    {
        return this.salarioBase + (this.totalVendasMes * (this.percComissao/100));
    }
}