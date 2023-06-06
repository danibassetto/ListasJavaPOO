package L9_E1;

public class Main
{
    public static void main(String[] args)
    {
        RadioRelogio rr = new RadioRelogio(Radio.FM, 50, 50, 88);
        rr.ligaRadio();
        rr.setVolumeRadio(70);
        rr.setSintonia(100);
        rr.setAlarme(20, 40);
        rr.ligaAlarme();
        rr.setVolumeAlarme(30);

        System.out.println("Banda: " + rr.getBanda());
        System.out.println("Frequência: " + rr.getSintonia());
        System.out.println("Volume: " + rr.getVolumeRadio());
        System.out.println("Hora: " + rr.getHorario());
        System.out.println("Status alarme: " + rr.getStatusAlarme());
        System.out.println("Hora alarme: " + rr.getAlarme());
        System.out.println("Volume do alarme: " + rr.getVolumeAlarme());
    }
}
