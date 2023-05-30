package L8_E3;

public class Horario implements MeuHorario {
    private int hora, minuto, segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String toString()
    {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
}