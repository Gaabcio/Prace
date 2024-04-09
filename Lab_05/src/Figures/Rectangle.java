package Figures;

public class Rectangle
{
    private double a, b;
    private String name = "Prostokąt";

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

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private double pole(double a, double b)
    {
        return a*b;
    }

    private double obwod(double a, double b){ return (2*a)+(2*b);}

    public void view()
    {
        System.out.format(
                "Figura: %s\n" +
                "Długość boków: a: %.2f, b: %.2f\n" +
                "Pole: %.2f\n" +
                "Obwód: %.2f\n", name, a, b, pole(a,b), obwod(a,b));
    }




}
