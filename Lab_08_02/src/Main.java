import java.util.Scanner;
public class Main {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        IsNegative isNegative = new IsNegative();

        System.out.println("Podaj liczbę do silni: ");
        int liczba = scanner.nextInt();

        isNegative.CheckIfNegative(liczba);

    }

    public int Silnia(int liczba)
    {
        IsNegative isNegative = new IsNegative();

        try
        {


            int i = 0;
            int wynik = 1;

            while (i < liczba)
            {
                wynik += wynik * i;
                i++;
            }

            return wynik;
        }
        catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Wyjątek: " + e.getMessage());
        }

        finally {
            System.out.println("Koniec programu.");
        }

    }

}