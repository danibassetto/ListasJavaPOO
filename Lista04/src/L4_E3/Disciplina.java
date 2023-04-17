package L4_E3;

public class Disciplina
{
    private int codigo, cargaHoraria;
    private String nome;
    private Professor professor;

    public Disciplina(int codigo, String nome, int cargaHoraria)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome()
    {
        return this.nome;
    }

    public Professor getProfessor()
    {
        return this.professor;
    }

    public void setProfessor(Professor professor)
    {
        this.professor = professor;
    }
}