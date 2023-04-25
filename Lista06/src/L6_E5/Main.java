package L6_E5;

public class Main
{
    public static void main(String[] args) {
        EquipamentoSonoro radio=new EquipamentoSonoro();
        radio.ligar();
        //radio.desligar();
        radio.setVolume(8);
        if(radio.getLigado()){
            System.out.println("O equipamento está "+
                    "ligado "+" no volume "+radio.getVolume());
        }else System.out.println("O equipamento está "+
                "desligado!");
    }
}
