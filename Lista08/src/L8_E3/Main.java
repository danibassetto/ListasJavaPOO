package L8_E3;

public class Main {
    public static void main(String[] args)
    {
        Horario h = new Horario();
        h.setHora(20);
        h.setMinuto(20);
        h.setSegundo(47);
        System.out.println("Horário: " + h.toString());
    }
}