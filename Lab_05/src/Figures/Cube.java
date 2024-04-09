package Figures;

public class Cube
{
    private double a;
    private String name = "Sześcian";

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private double pole(double a)
    {
        return Math.pow(a,2)*6;
    }

    private double obwod(double a)
    {
        return a*12;
    }

    private double objetosc(double a)
    {
        return Math.pow(a,3);
    }

    public void view()
    {
        System.out.format(
                "Figura: %s\n" +
                "Długość boku: %.2f\n" +
                "Pole: %.2f\nObwód: %.2f\n" +
                "Objętość: %.2f\n", name, a, pole(a), obwod(a), objetosc(a));
    }

}
