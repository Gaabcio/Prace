import java.util.Scanner;

public class Lab_04_06 {

    public static void main(String[] args)
    {
        int wynik = 0;
        int mnozenie=0;
        int[] tablica = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę nr " + (i + 1) + ": ");
            tablica[i] = inputInt();
        }

        for(int i = 0; i< 5; i++){
            int liczba = tablica[i];
            mnozenie = liczba * (liczba - 1);

            for (int j = liczba - 2; j > 0; j--)
            {
                wynik = mnozenie * j;
                mnozenie = wynik;
                liczba--;
            }
            System.out.println("Silnia liczby "+tablica[i]+" wynosi: "+ mnozenie);
        }



    }








    public static int inputInt () { //pobiera liczbę
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }


}//koniec klasy
