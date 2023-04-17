package L5_E1;

public class Main
{
    public static void main(String[] args)
    {
        Veiculo carro1 = new Veiculo("BHA8D91", "VW", "Fusca", "Branco");
        Veiculo carro2 = new Veiculo("FDG6H48", "FORD", "Ka", "Preto");

        Motorista joao = new Motorista("123456", "B", "João da Silva");
        joao.SetCarro(carro1);

        System.out.println("Motorista: " + joao.GetNome() + "\nCNH: " + joao.GetCNH() +
                "\nModelo: " + joao.GetCarro().GetModelo() + "\nPlaca: " + joao.GetCarro().GetPlaca());
    }
}