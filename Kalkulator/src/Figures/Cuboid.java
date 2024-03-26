package Figures;

public class Cuboid
{
    private double a, b, c;
    private String name = "Prostopadłościan";

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private double pole(double a, double b, double c)
    {
        return 2*(a*b + a*c + b*c);
    }

    private double obwod(double a, double b, double c)
    {
        return a*4 + b*4 + c*4;
    }

    private double objetosc(double a, double b, double c)
    {
        return a*b*c;
    }

    public void view()
    {
        System.out.format(
                "Figura: %s\n" +
                "Długości boków: a: %.2f, b: %.2f, c: %.2f\n" +
                "Pole: %.2f\n" +
                "Obwód: %.2f\n" +
                "Objętość: %.2f\n",
                name, a, b, c, pole(a,b,c), obwod(a,b,c), objetosc(a,b,c));
    }

}
