import java.util.Random;

public class Lab_04_01 {

    public static void main(String[] args) {
        int suma = 0;
        int srednia = 0;
        int[] tablica = new int[10];

        for(int i = 0; i < 10; i++){
            tablica[i] = Losuj(-20, 40);
        }

        for(int x : tablica){
            suma += x;
        }

        srednia = suma/tablica.length;
        System.out.println("Średnia wynosi: "+ srednia);
        System.out.println("Suma wynosi: "+ suma);

    }

    public static int Losuj(int a, int b){
        Random random = new Random();
        return random.nextInt(b-a-1)+a;
    }

}//koniec klasy
