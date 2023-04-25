package L6_E3;

public class MaiorMenor extends Media
{
    private int maiorValor, menorValor;

    public void processaValor(int n)
    {
        if(this.maiorValor == 0 && this.menorValor == 0)
        {
            this.maiorValor = n;
            this.menorValor = n;
        }
        else if (n > this.maiorValor)
            this.maiorValor = n;
        else if (n < this.menorValor)
            this.menorValor = n;
        this.acumula(n);
    }

    public int getMaiorValor()
    {
        return this.maiorValor;
    }

    public int getMenorValor()
    {
        return this.menorValor;
    }
}