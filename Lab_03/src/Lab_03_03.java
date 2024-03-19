import java.util.Scanner;

public class Lab_03_03 {

    public static void main(String[] args) {
    int suma = 0;

    for(int i = 0; i<10; i++)
    {
        System.out.println("Podaj liczbę nr "+i);
        int liczba = inputInt();

        if (liczba % 2 == 0)
            {
                suma += liczba;
            }
    }

        System.out.println("Suma wszystkich liczb parzystych z tego ciągu to: " + suma);
    }
    public static int inputInt () { //pobiera liczbę
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
















}//koniec klasy
