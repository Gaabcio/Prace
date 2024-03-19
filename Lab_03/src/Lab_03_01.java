import java.util.Scanner;

public class Lab_03_01 {
    public static void main(String[] args) {

        System.out.println("Podaj ilość studentów: ");
        int ilosc = inputInt();

        System.out.println("Średnia ilość punktów wszystkich studentów wynosi: " + Punkty(ilosc));

    }
    public static int inputInt(){ //pobiera liczbę
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }


    public static double Punkty(double ilosc)
    {
    double pkt = 0;
    int i = 1;
        while(i<=ilosc){
            System.out.println("Podaj liczbę punktów dla studenta nr "+ i);
            pkt += inputInt();
            i++;
        }
        return pkt / ilosc;
    }




}//koniec klasy

