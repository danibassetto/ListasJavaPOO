package L4_E1;

public class Conta
{
	private int numero;
	private String nomeTitular;
	private float saldo;
	private Cartao cartao;

	public Conta(String nomeTitular, int numero, String senha)
	{
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.cartao = new Cartao(senha);
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

	public Cartao GetCartao()
	{
		return this.cartao;
	}
}
