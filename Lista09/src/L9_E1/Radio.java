package L9_E1;

public interface Radio
{
    public int FM=0;
    public int AM=1;
    public int getBanda();
    public void setBanda(int banda);
    public float getSintonia();
    public void setSintonia(float frequencia);
    public int getVolumeRadio();
    public void setVolumeRadio(int vol);
    public void ligaRadio();
    public void desligaRadio();
}
