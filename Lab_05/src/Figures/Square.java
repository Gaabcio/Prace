package Figures;

public class Square
{
    private double a;
    private String name = "Kwadrat";

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private double pole(double a)
    {
        return Math.pow(a,2);
    }

    private double obwod(double a){ return 4*a;}

    public void view()
    {
        System.out.format(
                "Figura: %s\n" +
                "Długość boku: %.2f\n" +
                "Pole: %.2f\n" +
                "Obwód: %.2f\n", name, a, pole(a), obwod(a));
    }


}
