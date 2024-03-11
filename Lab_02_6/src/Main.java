import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz operację matematyczną:\n 1. Dodawanie\n 2. Odejmowanie\n 3. Iloczyn\n 4. Iloraz\n 5. Reszta z dzielenia\n Wybierz numer:");
        int wybor = inputInt();

        switch(wybor){
            case 1:
                Dodawanie();
                break;
            case 2:
                Odejmowanie();
                break;
            case 3:
                Iloczyn();
                break;
            case 4:
                Iloraz();
                break;
            case 5:
                ResztaZDzielenia();
                break;
            default:
                break;
        }


    }



    public static int inputInt() { //pobiera liczbe
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

        public static void Dodawanie(){
            System.out.println("Podaj liczby do dodania:");
            int a = inputInt();
            int b = inputInt();

            System.out.println("Wynik: " + (a+b));
    }
        public static void Odejmowanie(){
            System.out.println("Podaj liczby do odejmowania:");
            int a = inputInt();
            int b = inputInt();

            System.out.println("Wynik: " + (a-b));
    }
        public static void Iloczyn(){
            System.out.println("Podaj liczby do wymnożenia:");
            int a = inputInt();
            int b = inputInt();

            System.out.println("Wynik: " + (a*b));
    }
        public static void Iloraz(){
            System.out.println("Podaj liczby do podzielenia:");
            int a = inputInt();
            int b = inputInt();

            System.out.println("Wynik: " + (a/b));
    }
        public static void ResztaZDzielenia(){
            System.out.println("Podaj liczby do wyliczenia reszty z dzielenia:");
            int a = inputInt();
            int b = inputInt();

            System.out.println("Wynik: " + (a%b));
    }



}