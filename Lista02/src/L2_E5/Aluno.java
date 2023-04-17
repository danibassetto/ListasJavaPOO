package L2_E5;

public class Aluno
{
    private String ra;
    private String nome;
    private float p1;
    private float p2;
    private float media;

    public Aluno(String ra, String nome)
    {
        this.ra = ra;
        this.nome = nome;
    }
    public void AtribuirNotas(float notaP1, float notaP2)
    {
        this.p1 = notaP1;
        this.p2 = notaP2;
    }

    public float CalcularMedia()
    {
        this.media = (this.p1 + this.p2) / 2;
        return this.media;
    }

    public String VerificaSituacao()
    {
        if(this.media >= 7)
            return "Aprovado";
        else if(this.media < 7 && this.media >= 4)
            return "Exame";
        else return "Reprovado";
    }
}