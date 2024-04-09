
class Prostokat extends Figura {
	double wys=0, szer=0;

	Prostokat(double wys, double szer){
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(float wys, float szer, String kolor)
	{
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}



	void przesun(float x, float y)
	{
	 	 this.wys += wys;
		 this.szer += szer;
	}

    double getPowierzchnia() {
        return (szer * wys);
    }

	@Override
	void opis() {
		System.out.println("Klasa prostokąt. Wysokość: "+wys+" Szerokość: "+szer+ " Powierzchnia: "+getPowierzchnia());
	}
}