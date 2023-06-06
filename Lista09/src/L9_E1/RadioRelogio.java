package L9_E1;

import java.util.Date;

public class RadioRelogio implements Radio, Relogio
{
    private int banda;
    private int volumeRadio;
    private int volumeAlarme;
    private float frequencia;
    private int horaAlarme;
    private int minutoAlarme;
    private boolean alarmeLigado;
    private boolean radioLigado;

    public RadioRelogio(int banda, int vr, int va, float fr)
    {
        this.banda=banda;
        this.volumeRadio=vr;
        this.volumeAlarme=va;
        this.frequencia=fr;
    }

    public int getBanda() {
        return this.banda;
    }

    public void setBanda(int banda)
    {
       if(radioLigado)
           this.banda = banda;
    }

    public float getSintonia()
    {
        return this.frequencia;
    }

    public void setSintonia(float frequencia)
    {
        if(radioLigado)
            this.frequencia = frequencia;
    }

    public int getVolumeRadio()
    {
        return this.volumeRadio;
    }

    public void setVolumeRadio(int vol)
    {
        if(radioLigado)
            this.volumeRadio = vol;
    }

    public void ligaRadio()
    {
        this.radioLigado = true;
    }

    public void desligaRadio()
    {
        this.radioLigado = false;
    }

    public String getHorario()
    {
        Date agora=new Date();
        return agora.getHours()+":"+agora.getMinutes()+":"+
                agora.getSeconds();
    }
    public String getAlarme()
    {
        return this.horaAlarme+":"+this.minutoAlarme+":00";
    }

    public void setAlarme(int hora, int min)
    {
        this.horaAlarme = hora;
        this.minutoAlarme = min;
    }

    public void ligaAlarme()
    {
        this.alarmeLigado = true;
    }

    public void desligaAlarme()
    {
        this.alarmeLigado = false;
    }

    public int getStatusAlarme()
    {
        if(alarmeLigado)
            return 1;
        return 0;
    }

    public int getVolumeAlarme()
    {
        return this.volumeAlarme;
    }

    public void setVolumeAlarme(int vol)
    {
        this.volumeAlarme = vol;
    }
}