import java.util.Scanner;
public class Lab_03_02 {

    public static void main(String[] args) {
    int ilosc_dodatnich = 0;
    int suma_dodatnich = 0;
    int ilosc_ujemnych = 0;
    int suma_ujemnych = 0;

        for(int i = 0; i<10; i++)
        {
        System.out.println("Podaj liczbę nr "+ (i+1));
        int liczba = inputInt();
            if(liczba > 0)
            {
            suma_dodatnich += liczba;
            ilosc_dodatnich++;
            }

            else
            {
            suma_ujemnych += liczba;
            ilosc_ujemnych++;
            }
        }

        System.out.println("Ilość liczb dodatnich: " + ilosc_dodatnich);
        System.out.println("Suma liczb dodatnich: "  + suma_dodatnich);
        System.out.println("Ilość liczb ujemnych: "  + ilosc_ujemnych);
        System.out.println("Suma liczb ujemnych: "   + suma_ujemnych);

    }



    public static int inputInt(){ //pobiera liczbę
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

}//koniec klasy
