import java.util.Scanner;

class Fornecedor
{
    private int codigo;
    private String nome, endereco, telefone;

    public Fornecedor(int codigo, String nome, String endereco, String telefone)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
}
abstract class Produto
{
    private int codigo;
    private String descricao;
    private float preco;
    private Fornecedor fornecedor;

    public Produto(int codigo, String descricao, float preco)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public float getPreco()
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public Fornecedor getFornecedor()
    {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor)
    {
        this.fornecedor = fornecedor;
    }

    public abstract boolean vender(float v);

    public abstract void repor(float v);
}

class Pacote extends Produto
{
    private int qtde;

    public Pacote(int codigo, String descricao, float preco, int qtde)
    {
        super(codigo, descricao, preco);
        this.qtde = qtde;
    }

    public boolean vender(float qtde)
    {
        if((int)qtde <= this.qtde) {
            this.qtde -=qtde;
            return true;
        }
        else return false;
    }

    public void repor(float qtde)
    {
        this.qtde += (int)qtde;
    }
}

class Granel extends Produto
{
    private float peso;

    public Granel(int codigo, String descricao, float preco, float peso)
    {
        super(codigo, descricao, preco);
        this.peso = peso;
    }

    public boolean vender(float peso)
    {
        if(peso <= this.peso) {
            this.peso -= peso;
            return true;
        }
        else return false;
    }

    public void repor(float peso)
    {
        this.peso += peso;
    }
}

class Liquido extends Produto
{
    private float volume;

    public Liquido(int codigo, String descricao, float preco, float volume)
    {
        super(codigo, descricao, preco);
        this.volume = volume;
    }

    public boolean vender(float volume)
    {
        if(volume <= this.volume) {
            this.volume -= volume;
            return true;
        }
        else return false;
    }

    public void repor(float volume)
    {
        this.volume += volume;
    }
}
class PrincipalE6
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os seguintes dados do 1º Fornecedor");
        System.out.println("Nome: ");
        String nomef1 = teclado.nextLine();
        System.out.println("Endereço: ");
        String enderecof1 = teclado.nextLine();
        System.out.println("Telefone: ");
        String telefonef1 = teclado.nextLine();

        System.out.println("\nInforme os seguintes dados do 2º Fornecedor");
        System.out.println("Nome: ");
        String nomef2 = teclado.nextLine();
        System.out.println("Endereço: ");
        String enderecof2 = teclado.nextLine();
        System.out.println("Telefone: ");
        String telefonef2 = teclado.nextLine();

        System.out.println("\nInforme os seguintes dados do 3º Fornecedor");
        System.out.println("Nome: ");
        String nomef3 = teclado.nextLine();
        System.out.println("Endereço: ");
        String enderecof3 = teclado.nextLine();
        System.out.println("Telefone: ");
        String telefonef3 = teclado.nextLine();

        Fornecedor f1 = new Fornecedor(1, nomef1, enderecof1, telefonef1);
        Fornecedor f2 = new Fornecedor(2,  nomef2, enderecof2, telefonef2);
        Fornecedor f3 = new Fornecedor(3,  nomef3, enderecof3, telefonef3);

        System.out.println("Fornecedores criados com sucesso!");

        System.out.println("\nInforme os seguintes dados do produto tipo Pacote: ");
        System.out.println("Descrição: ");
        String descricaop1 = teclado.nextLine();
        System.out.println("Preço: ");
        float precop1 = teclado.nextFloat();
        System.out.println("Quantidade disponível: ");
        int quantidadep1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("\nInforme os seguintes dados do produto tipo Granel: ");
        System.out.println("Descrição: ");
        String descricaop2 = teclado.nextLine();
        System.out.println("Preço: ");
        float precop2 = teclado.nextFloat();
        System.out.println("Quantidade disponível: ");
        int quantidadep2 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("\nInforme os seguintes dados do produto tipo Líquido: ");
        System.out.println("Descrição: ");
        String descricaop3 = teclado.nextLine();
        System.out.println("Preço: ");
        float precop3 = teclado.nextFloat();
        System.out.println("Quantidade disponível: ");
        int quantidadep3 = teclado.nextInt();
        teclado.nextLine();

        Pacote p1 = new Pacote(1, descricaop1, precop1, quantidadep1);
        Granel p2 = new Granel(2, descricaop2, precop2, quantidadep2);
        Liquido p3 = new Liquido(3, descricaop3, precop3, quantidadep3);

        p1.setFornecedor(f1);
        p2.setFornecedor(f2);
        p3.setFornecedor(f3);

        System.out.println("\nInforme a quantidade que deseja vender do produto " + descricaop1 + ":");
        float venderp1 = teclado.nextFloat();
        if(!(p1.vender(venderp1)))
            System.out.println("Não foi possível realizar essa venda: quantidade indisponível");
        System.out.println("\nInforme a quantidade que deseja vender do produto " + descricaop2 + ":");
        float venderp2 = teclado.nextFloat();
        if(!(p2.vender(venderp2)))
            System.out.println("Não foi possível realizar essa venda: quantidade indisponível");
        System.out.println("\nInforme a quantidade que deseja vender do produto " + descricaop3 + ":");
        float venderp3 = teclado.nextFloat();
        if(!(p3.vender(venderp3)))
            System.out.println("Não foi possível realizar essa venda: quantidade indisponível");

        System.out.println("\nInforme a quantidade que deseja repor do produto " + descricaop1 + ":");
        float reporp1 = teclado.nextFloat();
        System.out.println("\nInforme a quantidade que deseja repor do produto " + descricaop2 + ":");
        float reporp2 = teclado.nextFloat();
        System.out.println("\nInforme a quantidade que deseja repor do produto " + descricaop3 + ":");
        float reporp3 = teclado.nextFloat();

        p1.repor(reporp1);
        p2.repor(reporp2);
        p3.repor(reporp3);

        if(p1.getPreco() > p2.getPreco() && p1.getPreco() > p3.getPreco())
            System.out.println("Fornecedor do produto mais caro: " +
                    "\nCódigo: " + p1.getFornecedor().getCodigo() +
                    "\nNome: " + p1.getFornecedor().getNome() +
                    "\nEndereço: " + p1.getFornecedor().getEndereco() +
                    "\nTelefone: " + p1.getFornecedor().getTelefone() +
                    "\nProduto mais caro: " + p1.getDescricao());
        else if(p2.getPreco() > p3.getPreco())
            System.out.println("Fornecedor do produto mais caro: " +
                    "\nCódigo: " + p2.getFornecedor().getCodigo() +
                    "\nNome: " + p2.getFornecedor().getNome() +
                    "\nEndereço: " + p2.getFornecedor().getEndereco() +
                    "\nTelefone: " + p2.getFornecedor().getTelefone() +
                    "\nProduto mais caro: " + p2.getDescricao());
        else
            System.out.println("Fornecedor do produto mais caro: " +
                    "\nCódigo: " + p3.getFornecedor().getCodigo() +
                    "\nNome: " + p3.getFornecedor().getNome() +
                    "\nEndereço: " + p3.getFornecedor().getEndereco() +
                    "\nTelefone: " + p3.getFornecedor().getTelefone() +
                    "\nProduto mais caro: " + p3.getDescricao());
    }
}