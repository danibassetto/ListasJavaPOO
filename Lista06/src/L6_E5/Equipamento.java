package L6_E5;

public class Equipamento
{
    private boolean ligado;
    public void ligar(){
        this.ligado=true;
    }
    public void desligar(){
        this.ligado=false;
    }
    public boolean getLigado(){
        return this.ligado;
    }
}