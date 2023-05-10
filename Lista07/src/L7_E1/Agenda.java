package L7_E1;
import java.util.ArrayList;

public class Agenda {
    private ArrayList <Contato> listaContatos;
    public Agenda()
    {
        this.listaContatos=new <Contato> ArrayList();
    }

    public void incluiContato(String nome, String fone, String dt)
    {
        this.listaContatos.add(new Contato(nome, fone, dt));
    }

    public void incluiContato(Contato c)
    {
        this.listaContatos.add(c);
    }

    public Contato consultaContato(String nome){
        for (Contato c: this.listaContatos)
            if(c.getNome().equals(nome)){
                return c;
            }
        return null;
    }
}
