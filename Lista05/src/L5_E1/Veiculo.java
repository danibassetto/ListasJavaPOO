package L5_E1;

public class Veiculo
{
    private String placa, marca, modelo, cor;

    public Veiculo(String placa, String marca, String modelo, String cor)
    {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String GetPlaca()
    {
        return this.placa;
    }

    public String GetMarca()
    {
        return this.marca;
    }

    public String GetModelo()
    {
        return this.modelo;
    }

    public String GetCor()
    {
        return this.cor;
    }
}