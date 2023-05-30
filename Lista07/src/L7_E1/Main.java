package L7_E1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Agenda ag=new Agenda();
        ag.carregaContatos();
        int op;
        do{
            System.out.println("1-Cadastrar\n2-Consultar\n3-Atualizar\n4-Excluir\n5-Finalizar\nOpção: ");
            op=teclado.nextInt();
            switch(op){
                case 1: String nome, fone, dt;
                    System.out.print("Nome para cadastrar: ");
                    nome=teclado.next();
                    System.out.print("Fone: ");
                    fone=teclado.next();
                    System.out.print("Data aniversário: ");
                    dt=teclado.next();
                    ag.incluiContato(nome, fone, dt);
                    break;
                case 2: System.out.print("Nome para consultar: ");
                    nome=teclado.next();
                    Contato c=ag.consultaContato(nome);
                    if(c!=null)
                        System.out.println("Nome: "+c.getNome()+"\nFone: "+c.getFone()+"\nAniversário: "+c.getData());
                    else System.out.println("Contato inexistente!");
                    break;
                case 3: System.out.print("Nome para atualizar o fone: ");
                    nome=teclado.next();
                    System.out.print("Novo fone: ");
                    fone=teclado.next();
                    if(ag.autalizaContato(nome,fone))
                        System.out.println("Fone atualizado!");
                    else System.out.println("Contato inexistente!");
                    break;
                case 4: System.out.print("Nome para excluir: ");
                    nome=teclado.next();
                    if(ag.excluiContato(nome))
                        System.out.println("Contato excluído!");
                    else System.out.println("Contato inexistente!");
                    break;
                case 5: ag.gravaContatos();
                    break;
                default: System.out.println("Opção inválida!");
            }
        }while(op!=5);

        Media media = new Media();
        media.Media(1,2);
    }
}