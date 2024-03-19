import java.util.Scanner;

public class Lab_02_03 {
    public static void main(String[] args) {

        System.out.println("Podaj wartość x: ");
        int x = inputInt();
        System.out.println("Podaj wartość y: ");
        int y = inputInt();
        System.out.println("Podaj wartość z: ");
        int z = inputInt();

        Sortowanie(x, y, z);
    }

    public static int inputInt() { //pobiera liczbe
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void Sortowanie(int x, int y, int z) {
        int[] liczby = {x, y, z};
        int temp;

        if (liczby[0] > liczby[1]) {
            temp = liczby[0];
            liczby[0] = liczby[1];
            liczby[1] = temp;
        }
        if (liczby[1] > liczby[2]) {
            temp = liczby[1];
            liczby[1] = liczby[2];
            liczby[2] = temp;
        }
        if (liczby[0] > liczby[1]) {
            temp = liczby[0];
            liczby[0] = liczby[1];
            liczby[1] = temp;
        }
        System.out.println("Posortowane liczby: " + liczby[0] + ", " + liczby[1] + ", " + liczby[2]);
    }
}