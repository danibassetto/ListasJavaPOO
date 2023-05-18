package L7_E1;

class Contato{
    private String nome, fone, dtAniversario;

    public Contato(String nome, String fone, String dtAniversario) {
        this.nome = nome;
        this.fone = fone;
        this.dtAniversario = dtAniversario;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getData() {
        return dtAniversario;
    }

    public void setFone(String fone){
        this.fone=fone;
    }
}