import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try
        {
            System.out.println("Podaj liczbę którą do której chcesz zastosować pierwiastkowanie: ");
            int liczba = scanner.nextInt();
            double wynik = Math.sqrt(liczba);

            if (liczba <= 0)
            {
                throw new IllegalArgumentException("Podaj dodatnią liczbę!");
            }
            System.out.println("Wynik: "+ wynik);
        }

        catch (IllegalArgumentException e)
        {
            System.err.println("Wyjątek: " + e.getMessage());
        }

        catch (InputMismatchException e)
        {
            System.err.println("Podaj liczbę, nie ciąg znaków");
        }

        finally
        {
            System.out.println("Koniec programu.");
        }
    }
}