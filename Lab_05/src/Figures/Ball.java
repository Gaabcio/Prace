package Figures;

public class Ball
{
    private double r;
    private String name="Kula";

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    private double pole(double r){ return 4*Math.PI*Math.pow(r,2);}
    private double objetosc(double r){ return (4*Math.PI*Math.pow(r,3))/3;}
    public void view(){
        System.out.format(
                "Figura: %s\n" +
                "Promień: %.2f\n" +
                "Pole: %.2f\n" +
                "Objętość: %.2f\n", name, r, pole(r), objetosc(r));
    }

}
