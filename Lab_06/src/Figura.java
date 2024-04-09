

class Figura {

	//pola metody i konstruktory
	Punkt punkt;
	String kolor = "biały";
	
	
	Figura(){
		punkt = new Punkt(0,0);
	}
	Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	void opis(){
		System.out.println("Klasa Figura. Kolor obiektu: "+kolor);
	}
			
	
}
