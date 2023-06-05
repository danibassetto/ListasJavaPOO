import java.util.Scanner;

abstract class FormaGeometrica
{
    protected float area;
    protected float perimetro;
    private String nome;

    public FormaGeometrica(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public float getArea()
    {
        return this.area;
    }

    public float getPerimetro()
    {
        return this.perimetro;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}

class Circulo extends FormaGeometrica
{
    private float raio;

    public Circulo(float raio)
    {
        super("Círculo");
        this.raio = raio;
    }

    public void calcularArea()
    {
        super.area = (float)(Math.PI * Math.pow(raio, 2));
    }

    public void calcularPerimetro()
    {
        super.perimetro = (float) (2 * Math.PI * raio);
    }
}

class Quadrado extends FormaGeometrica
{
    private float lado;

    public Quadrado(float lado)
    {
        super("Quadrado");
        this.lado = lado;
    }

    public void calcularArea()
    {
        super.area = lado * lado;
    }

    public void calcularPerimetro()
    {
        super.perimetro = 4 * lado;
    }
}

class Retangulo extends FormaGeometrica
{
    private float lado1;
    private float lado2;

    public Retangulo(float lado1, float lado2)
    {
        super("Retângulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcularArea()
    {
        super.area = lado1 * lado2;
    }

    public void calcularPerimetro()
    {
        super.perimetro = 2 * lado1 + 2 * lado2;
    }
}

class PrincipalE7
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo: ");
        float raio = teclado.nextFloat();

        Circulo circulo = new Circulo(raio);

        System.out.println("\nInforme o valor do lado do quadrado: ");
        float lado = teclado.nextFloat();

        Quadrado quadrado = new Quadrado(lado);

        System.out.println("\nInforme o valor do lado1 do retângulo: ");
        float lado1 = teclado.nextFloat();
        System.out.println("\nInforme o valor do lado2 do retângulo: ");
        float lado2 = teclado.nextFloat();

        Retangulo retangulo = new Retangulo(lado1, lado2);

        circulo.calcularArea();
        circulo.calcularPerimetro();
        float areaCirculo = circulo.area;
        float perimetroCirculo = circulo.perimetro;

        quadrado.calcularArea();
        quadrado.calcularPerimetro();
        float areaQuadrado = quadrado.area;
        float perimetroQuadrado = quadrado.perimetro;

        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        float arearetangulo = retangulo.area;
        float perimetroretangulo = retangulo.perimetro;

        if(circulo.getArea() > quadrado.getArea() && circulo.getArea() > retangulo.getArea())
            System.out.println("Figura com maior área: " + circulo.getNome() + " - Área: " + circulo.getArea());
        else if(quadrado.getArea() > retangulo.getArea())
            System.out.println("Figura com maior área: " + quadrado.getNome() + " - Área: " + quadrado.getArea());
        else
            System.out.println("Figura com maior área: " + retangulo.getNome() + " - Área: " + retangulo.getArea());

        if(circulo.getPerimetro() > quadrado.getPerimetro() && circulo.getPerimetro() > retangulo.getPerimetro())
            System.out.println("Figura com maior perímetro: " + circulo.getNome() + " - Perímetro: " + circulo.getPerimetro());
        else if(quadrado.getPerimetro() > retangulo.getPerimetro())
            System.out.println("\nFigura com maior perímetro: " + quadrado.getNome() + " - Perímetro: " + quadrado.getPerimetro());
        else
            System.out.println("\nFigura com maior perímetro: " + retangulo.getNome() + " - Perímetro: " + retangulo.getPerimetro());
    }
}