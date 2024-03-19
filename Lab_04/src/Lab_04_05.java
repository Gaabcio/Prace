import java.util.Scanner;
public class Lab_04_05 {


    public static void main(String[] args)
    {
        int[] tablica = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.println("Podaj liczbę nr "+(i+1)+": ");
            tablica[i] = inputInt();
        }

        // Sortowanie tablicy rosnąco
        for (int i = 1; i < 8; i++)
        {
            int key = tablica[i];
            int poprzedni = i - 1;

            while (poprzedni >= 0 && tablica[poprzedni] > key)
            {
                tablica[poprzedni + 1] = tablica[poprzedni];
                poprzedni--;
            }
            tablica[poprzedni + 1] = key;
        }
        System.out.println("Wynik sortowania:");
        for (int number : tablica) {
            System.out.print(number + " ");
        }

    }






    public static int inputInt() { //pobiera liczbe
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}//koniec klasy
