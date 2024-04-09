

public class Main
{
    public static void main(String[] args)
    {
        Punkt punkt1 = new Punkt(3,6);
        Punkt punkt2 = new Punkt(1,2);
        Punkt punkt3 = new Punkt(4,0);

        punkt1.opis();
        punkt1.zeruj();
        punkt1.opis();

        punkt2.opis();
        punkt2.przesun(4,2);
        punkt2.opis();

        punkt3.opis();


        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(3,5);
        Trojkat trojkat = new Trojkat(6,2);
        Kwadrat kwadrat = new Kwadrat(7);
        Okrag okrag = new Okrag();

        prostokat.opis();
        prostokat.przesun(3,5);
        prostokat.opis();

        trojkat.opis();
        kwadrat.opis();
        okrag.opis();
    }


}