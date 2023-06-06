package L9_E1;

public interface Relogio
{
    public String getHorario();
    public String getAlarme();
    public void setAlarme(int hora, int min);
    public void ligaAlarme();
    public void desligaAlarme();
    public int getStatusAlarme();
    public int getVolumeAlarme();
    public void setVolumeAlarme(int vol);
}
