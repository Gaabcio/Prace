
class Trojkat extends Figura
{
	double wys=0, podst=0;

	public Trojkat(double wys, double podst)
	{
		super();
		this.wys = wys;
		this.podst = podst;
	}

	double getPowierzchnia()
	{
		return (podst*wys*Math.sqrt(3)/2);
	}

	@Override
	void opis() {
		System.out.println("Trójkąt o wysokości " + wys + ", podstawie " + podst + ", kolor: " + kolor + " Powierzchnia: "+getPowierzchnia());
	}
}