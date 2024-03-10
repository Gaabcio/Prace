import java.util.Random;
import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args)
    {

         System.out.println("Hello world!");
         System.out.println("Imie: " + imie()+ " lat: " + wiek());


         System.out.println("Podaj a: ");
         int a = inputInt();
         System.out.println("Podaj b: ");
         int b = inputInt();
         zadanie2(a,b);

        System.out.println("Podaj liczbe: (czy parzysta)");
        int liczba = inputInt();
        System.out.println(CzyParzysta(liczba));

        System.out.println("Podaj liczbe: (czy podzielna)");
        int liczba_podz = inputInt();
        System.out.println(CzyPodzielna(liczba_podz));

        System.out.println("Podaj liczbe do potęgowania: ");
        int liczba_potegowana = inputInt();
        Potegowanie(liczba_potegowana);

        System.out.println("Podaj liczbe do pierwiastkowania: ");
        int liczba_pierwiastkowana = inputInt();
        Pierwiastek(liczba_pierwiastkowana);

        System.out.println("Podaj zakres od lewej: ");
        int x = inputInt();
        System.out.println("Podaj zakres od prawej: ");
        int y = inputInt();

        int los_1 = Losuj(x,y);
        int los_2 = Losuj(x,y);
        int los_3 = Losuj(x,y);

        System.out.println(Trojkat(los_1, los_2, los_3));

    }


    public static String imie() {
        return "Gabriel";
    }

    public static int wiek(){
        return 20;
    }

    public static void zadanie2(int a, int b){
        System.out.println("Suma: " + a + " + " + b + " = " + (a+b));
        System.out.println("Różnica: " + a + " - " + b + " = " + (a-b));
        System.out.println("Iloczyn: " + a + " * " + b + " = " + (a*b));
    }

    public static int inputInt(){ //pobiera liczbe
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static boolean CzyParzysta(int liczba){
        return liczba % 2 == 0;
    }

    public static boolean CzyPodzielna(int liczba){

        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    //zad5
    public static void Potegowanie(int liczba){
        System.out.println("Liczba" + liczba + "do potęgi ^3 wynosi: " + (Math.pow(liczba,3)));
    }
    //zad6
    public static void Pierwiastek(int liczba){
        System.out.println("Pierwiastek kwadratowy" + liczba + "wynosi: " + (Math.sqrt(liczba)));
    }


    public static int Losuj(int a, int b){
        Random random = new Random();
        System.out.println("Zakres: " + a + "do" + b);

        return random.nextInt(b-a-1)+a;
    }

    //zad7
    public static boolean Trojkat(int a, int b, int c){
        return a * a + b * b == c * c || a * a == b * b + c * c || b * b == a * a + c * c;
    }


}//Koniec klasy

