package Figures;

public class Cone
{
    private double r, h, l;
    private String name="Stożek";

    public double getR() { return r; }

    public void setR(double r)
    {
        this.r = r;
    }

    public double getH()
    {
        return h;
    }

    public void setH(double h)
    {
        this.h = h;
    }

    public double getL()
    {
        return l;
    }

    public void setL(double l)
    {
        this.l = l;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private double pole(double r, double l)
    {
        return (Math.PI*Math.pow(r,2)) + (Math.PI*r*l);
    }

    private double objetosc(double r, double h)
    {
        return (Math.PI*Math.pow(r,2)*h)/3;
    }

    public void view(){
        System.out.format(
                "Figura: %s\n" +
                "Promień: %.2f\n" +
                "Tworząca stożka: %.2f\n" +
                "Wysokość: %.2f\n" +
                "Pole: %.2f\n" +
                "Objętość: %.2f\n", name, r, l, h, pole(r, l), objetosc(r, h));
    }


}
