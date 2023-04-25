package L6_E3;

public class Media
{
    private int soma;
    protected int contador;
    public Media()
    {
        this.soma=0;
        this.contador=0;
    }
    public void acumula(int i)
    {
        this.soma+=i;
        this.contador++;
    }
    public float mediaAtual()
    {
        return this.soma/(float)this.contador;
    }
}