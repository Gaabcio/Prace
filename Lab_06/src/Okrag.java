public class Okrag extends Figura{

    public Punkt srodek;
    public double promien;

    public Okrag(){
        this.srodek = new Punkt(0,0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien){
        this.srodek = srodek;
        this.promien = promien;
    }
    public double getPowierzchnia()
    {
    return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica(){
        return 2 * promien;
    }

    public void setPromien(double p){
        this.promien = p;
    }

    public boolean wSrodku(Punkt punkt){
        double odleglosc = Math.sqrt(Math.pow(punkt.getX() - srodek.getX(),2) + Math.pow(punkt.getY() - srodek.getY(), 2));
        return odleglosc <= promien;
    }

    @Override
    public void opis() {
        System.out.println("Okrąg o środku (" + srodek.getX() + ", " + srodek.getY() + ") i promieniu " + promien + "powierzchnia: "+ getPowierzchnia());
    }
}//koniec klasy
