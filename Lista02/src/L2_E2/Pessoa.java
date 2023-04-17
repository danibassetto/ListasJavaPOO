package L2_E2;

public class Pessoa
{
	public String nome;
	public int idade;
	public String telefone;

	public void fazAniversario()
	{
		this.idade++;
	}

	public void atualizaTelefone(String novoTelefone)
	{
		this.telefone = novoTelefone;
	}
}
