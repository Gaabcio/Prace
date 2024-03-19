import java.util.Scanner;
import java.util.Random;

public class Lab_03_04 {

    public static void main(String[] args)
    {
        int suma = 0;
        for(int i = 0; i<10; i++)
        {
            int liczba = Losuj();
            System.out.println("Liczba nr "+i+": "+liczba);

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

    public static int Losuj(){
        Random random = new Random();
        System.out.println("Zakres: " + (-10) + "do" + 45);

        return random.nextInt(45-(-10)-1)+(-10);
    }

    }//koniec klasy

