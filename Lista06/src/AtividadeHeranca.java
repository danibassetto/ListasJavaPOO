import java.util.Scanner;

class Fornecedor
{
    private String nome, endereco, telefone;

    public Fornecedor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }
}

class Produto
{
    private int codigo;
    private String descricao;
    protected int qtdeVendida;
    private float preco;
    private Fornecedor fornecedor;

    public Produto(int codigo, String descricao, float preco, Fornecedor fornecedor)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.qtdeVendida = 0;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public float getFaturamento()
    {
        return this.qtdeVendida * this.preco;
    }
}

class Peca extends Produto
{
    private int qtdeDisponivel;

    public Peca(int codigo, String descricao, float preco, Fornecedor fornecedor) {
        super(codigo, descricao, preco, fornecedor);
        this.qtdeDisponivel = 0;
    }

    public boolean vender(int qtde)
    {
        if (qtde <= this.qtdeDisponivel)
        {
            this.qtdeDisponivel -= qtde;
            this.qtdeVendida += qtde;
            return true;
        }
        else return false;
    }

    public void repor(int qtde)
    {
        this.qtdeDisponivel += qtde;
    }
}

class Servico extends Produto
{
    private int tempoServico;

    public Servico(int codigo, String descricao, float preco, Fornecedor fornecedor, int tempoServico) {
        super(codigo, descricao, preco, fornecedor);
        this.tempoServico = tempoServico;
    }

    public boolean vender(int qtde)
    {
        this.qtdeVendida += qtde;
        return true;
    }
}

class Principal
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os dados do 1º Fornecedor: ");
        System.out.println("Nome: ");
        String nome1 = teclado.nextLine().toUpperCase();
        System.out.println("Endereço: ");
        String endereco1 = teclado.nextLine();
        System.out.println("Telefone: ");
        String telefone1 = teclado.nextLine();

        Fornecedor fornecedor1 = new Fornecedor(nome1, endereco1, telefone1);

        System.out.println("\nInforme os dados do 2º Fornecedor: ");
        System.out.println("Nome: ");
        String nome2 = teclado.nextLine().toUpperCase();
        System.out.println("Endereço: ");
        String endereco2 = teclado.nextLine();
        System.out.println("Telefone: ");
        String telefone2 = teclado.nextLine();

        Fornecedor fornecedor2 = new Fornecedor(nome2, endereco2, telefone2);

        System.out.println("\nFornecedores cadastrados com sucesso!");

        System.out.println("\nInforme os dados da peça: ");
        System.out.println("Código: ");
        int codigoPeca = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Descrição: ");
        String descricaoPeca = teclado.nextLine().toUpperCase();
        System.out.println("Preço: ");
        float precoPeca = teclado.nextFloat();

        Peca peca = new Peca(codigoPeca, descricaoPeca, precoPeca, fornecedor1);

        System.out.println("\nInforme os dados do serviço: ");
        System.out.println("Código: ");
        int codigoServico = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Descrição: ");
        String descricaoServico = teclado.nextLine().toUpperCase();
        System.out.println("Preço: ");
        float precoServico = teclado.nextFloat();
        System.out.println("Tempo de serviço: ");
        int tempoServico = teclado.nextInt();

        Servico servico = new Servico(codigoServico, descricaoServico, precoServico, fornecedor2, tempoServico);

        System.out.println("\nQuanto você deseja repor da peça " + peca.getDescricao() + "?");
        peca.repor(teclado.nextInt());

        System.out.println("\nQuanto deseja vender da peça/produto " + peca.getDescricao() + "?");
        if(peca.vender(teclado.nextInt()))
            System.out.println("Venda realizada com sucesso!");
        else System.out.println("Venda não realizada, quantidade indisponível!");

        System.out.println("\nQuanto deseja vender do serviço/produto " + servico.getDescricao() + "?");
        servico.vender(teclado.nextInt());
        System.out.println("Venda realizada com sucesso!");

        Produto produtoComMaiorFaturamento = peca.getFaturamento() > servico.getFaturamento() ? peca : servico;

        System.out.println("\nFornecedor com maior faturamento: " + produtoComMaiorFaturamento.getFornecedor().getNome()
                + "\nProduto vendido: " + produtoComMaiorFaturamento.getDescricao()
                + "\nValor vendido: R$" + String.format("%.2f", produtoComMaiorFaturamento.getFaturamento()));
    }
}