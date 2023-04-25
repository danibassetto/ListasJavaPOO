package L6_E5;

public class EquipamentoSonoro extends Equipamento
{
        private int volume;
        private boolean stereo;

        public int getVolume(){
            return this.volume;
        }
        public boolean getStereo(){
            return this.stereo;
        }
        public void setVolume(int vol){
            this.volume=vol;
        }
        public void setMono(){
            this.stereo=false;
        }
        public void setStereo(){
            this.stereo=true;
        }
        public void ligar(){
            this.volume=5;
            super.ligar();
        }
}