public class SamochodOsobowy extends Samochod {
    private double waga, pojemnosc_silnika, ilosc_osob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg, double waga, double pojemnosc_silnika, double ilosc_osob) {
       super(marka, model, nadwozie, kolor, rok_produkcji, przebieg);
       this.waga = waga;
       this.pojemnosc_silnika = pojemnosc_silnika;
       this.ilosc_osob = ilosc_osob;
    }
public void dane_uzytkownika()
{
    Input input = new Input();
    super.dane_od_uzytkownika();

    do
    {
        System.out.println("Podaj wagę samochodu: (od 2t do 4,5t)");
        waga = input.inputDouble();
    }while( waga < 2 || waga > 4.5);

    do
    {
    System.out.println("Podaj pojemność silnika: (od 0.8 do 3.0)");
    pojemnosc_silnika = input.inputDouble();
    }while( pojemnosc_silnika < 0.8 || pojemnosc_silnika > 3.0);

    System.out.println("Podaj ilość miejsc siedzących: ");
    ilosc_osob = input.inputDouble();
}
@Override
public void dane_pojazdu()
{
   super.dane_pojazdu();
   System.out.println(
         "Waga: " +waga+ "\nPojemność silnika [L]: "
         +pojemnosc_silnika+ "\nIlość miejsc siedzących: "+ilosc_osob);
}


}
