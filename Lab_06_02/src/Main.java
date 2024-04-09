public class Main {
    public static void main(String[] args) {

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy(
                "Volkswagen", "Passat B6",
                "Kombi", "Biały",
                2006, 310412,
                1.5, 1.9, 5);
        samochodOsobowy.dane_pojazdu();

        samochodOsobowy.dane_uzytkownika();
        samochodOsobowy.dane_pojazdu();

        Samochod samochod = new Samochod(
                "Tesla", "Model X",
                "Coupe", "Czarny",
                2023, 124312);
        samochod.dane_pojazdu();

        samochod.dane_od_uzytkownika();
        samochod.dane_pojazdu();


    }
}