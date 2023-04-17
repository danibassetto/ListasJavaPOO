package L2_E1;

public class Retangulo
{
	private int base, altura;
	public Retangulo(int base, int altura)
	{
		this.base = base;
		this.altura = altura;
	}

	public int calculaArea()
	{
		return this.base * this.altura;
	}

	public int calculaPerimetro()
	{
		return 2 * this.base + 2 * this.altura;
	}

}