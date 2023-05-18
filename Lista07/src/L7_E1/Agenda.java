package L7_E1;
import java.io.*;
import java.util.ArrayList;

class Agenda {
    private ArrayList <Contato> listaContatos;
    public Agenda(){
        this.listaContatos=new <Contato> ArrayList();
    }

    public void incluiContato(String nome, String fone, String dt){
        this.listaContatos.add(new Contato(nome, fone, dt));
    }

    public void incluiContato(Contato c){
        this.listaContatos.add(c);
    }

    public Contato consultaContato(String nome){
        for (Contato c: this.listaContatos)
            if(c.getNome().equals(nome)){
                return c;
            }
        return null;
    }

    public boolean autalizaContato(String nome, String fone){
        for (Contato c: this.listaContatos)
            if(c.getNome().equals(nome)){
                c.setFone(fone);
                return true;
            }
        return false;
    }
    public boolean excluiContato(String nome){
        for (Contato c: this.listaContatos)
            if(c.getNome().equals(nome)){
                this.listaContatos.remove(c);
                return true;
            }
        return false;
    }

    public void carregaContatos(){
        try (BufferedReader leitor = new BufferedReader(new FileReader("contatos.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String dados[]=linha.split(";");
                Contato c=new Contato(dados[0], dados[1], dados[2]);
                this.listaContatos.add(c);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public void gravaContatos(){
        try (BufferedWriter escrita = new BufferedWriter(new FileWriter("contatos.txt"))) {
            for (Contato c: this.listaContatos){
                String linha=c.getNome()+";"+c.getFone()+";"+c.getData()+"\n";
                escrita.write(linha);
            }
            escrita.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

    }

}