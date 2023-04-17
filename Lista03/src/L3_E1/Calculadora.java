package L3_E1;

public class Calculadora
{
    private float numero1;
    private float numero2;

    public Calculadora(int numero1, int numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora(float numero1, float numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float retornaSoma()
    {
        return numero1 + numero2;
    }

    public float retornaMultiplicacao()
    {
        return numero1 * numero2;
    }

    public void setaNumeros(int numero1, int numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setaNumeros(float numero1, float numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
}