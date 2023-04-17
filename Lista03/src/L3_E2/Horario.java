package L3_E2;

public class Horario
{
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int h, int m, int s)
    {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public Horario(int s)
    {
        int horas = s / 3600;
        int minutos = (s % 3600) / 60;
        int segundos = s % 60;

        this.hora = horas;
        this.minuto = minutos;
        this.segundo = segundos;
    }

    public String getHorario()
    {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public int horarioEmSegundos()
    {
        return this.segundo += (this.hora * 3600 + this.minuto * 60);
    }

    public void somaHorario(int h, int m, int s)
    {
        this.segundo += s;
        this.minuto += m;
        this.hora += h;

        if (this.segundo >= 60) {
            this.minuto += this.segundo / 60;
            this.segundo %= 60;
        }

        if (this.minuto >= 60) {
            this.hora += this.minuto / 60;
            this.minuto %= 60;
        }
    }

    public void somaHorario(int s)
    {
        this.segundo += s;

        if (this.segundo >= 60) {
            this.minuto += this.segundo / 60;
            this.segundo %= 60;
        }

        if (this.minuto >= 60) {
            this.hora += this.minuto / 60;
            this.minuto %= 60;
        }
    }
}