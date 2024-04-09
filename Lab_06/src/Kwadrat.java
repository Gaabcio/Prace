public class Kwadrat extends Prostokat{

    double bok;
    Kwadrat(float bok) {
        super(bok, bok);
        setBok(bok);
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    @Override
    public void opis(){
        System.out.println("Klasa kwadrat. Długość boku: " + getBok());
    }
}
