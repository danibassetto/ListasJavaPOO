package L2_E3;

public class Conta
{
	private int numero;
	private String nomeTitular;
	private float saldo;

	public Conta(String nomeTitular, int numero)
	{
		this.nomeTitular = nomeTitular;
		this.numero = numero;
	}

	public boolean depositar(float valor)
	{
		if(valor > 0)
		{
			this.saldo += valor;
			return true;
		}
		return false;
	}

	public boolean sacar(float valor)
	{
		if(valor <= this.saldo)
		{
			this.saldo -= valor;
			return true;
		}
		else return false;
	}

	public float GetSaldo()
	{
		return this.saldo;
	}

	public String GetNomeTitular()
	{
		return this.nomeTitular;
	}

	public int GetNumeroConta()
	{
		return this.numero;
	}
}
