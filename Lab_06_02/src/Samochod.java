public class Samochod {
    private String marka, model, nadwozie, kolor;
    private int rok_produkcji, przebieg;


    public void dane_od_uzytkownika(){ //podane przez użytkownika
    Input input = new Input();

        System.out.println("Podaj markę samochodu: ");
        marka = input.inputChar();

        System.out.println("Podaj model samochodu: ");
        model = input.inputChar();

        System.out.println("Podaj rodzaj nadwozia: ");
        nadwozie = input.inputChar();

        System.out.println("Podaj kolor samochodu:");
        kolor = input.inputChar();

        System.out.println("Podaj rok produkcji samochodu:");
        rok_produkcji = input.inputInt();

        do
        {
            System.out.println("Podaj przebieg samochodu: (minimum 0)");
            przebieg = input.inputInt();
        }while (przebieg < 0);

    }

    //podanie danych przez wpisanie w kodzie
    public Samochod(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg)
    {
    this.marka = marka;
    this.model = model;
    this.nadwozie = nadwozie;
    this.kolor = kolor;
    this.rok_produkcji = rok_produkcji;
    this.przebieg = przebieg;
        if (przebieg < 0)
        {
            przebieg = 0;
            System.out.println("Przebieg nie może być ujemny. Ustawiono na 0.");
        }
    }

    public void dane_pojazdu(){
        System.out.println(
                "Marka: " +marka+ "\nModel: " +model+ "\nNadwozie: "
                +nadwozie+ "\nKolor: " +kolor+ "\nRok produkcji: "
                +rok_produkcji+ "\nPrzebieg: " +przebieg);
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}
