package L8_E4;

public class Main
{
    public static void main(String[] args)
    {
        Data hoje = new Data();
        hoje.setDia(29);
        hoje.setMes(5);
        hoje.setAno(2023);

        System.out.println("Hoje é "+hoje.mostrarData());
    }
}