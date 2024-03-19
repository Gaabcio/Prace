import java.util.Scanner;

public class Lab_02_01 {
    public static void main(String[] args)
    {
        System.out.println("Podaj wartość a: ");
        int a = inputInt();
        System.out.println("Podaj wartość b: ");
        int b = inputInt();
        System.out.println("Podaj wartość c: ");
        int c = inputInt();
        RowananieKwadratowe(a,b,c);
    }

    public static int inputInt(){ //pobiera liczbe
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void RowananieKwadratowe(int a, int b, int c)
    {
        double delta = b*b-4*a*c;

        if(delta < 0)
        {
            System.out.println("Brak rozwiązań!");
        }

        else if (delta == 0)
        {
            double x0= -b/2*a;
            System.out.println("Pierwiastkiem równania kwadratowego jest: " + x0);
        }

        if(delta > 0){
            double x1 = -b-Math.sqrt(delta)/2*a;
            double x2 = -b+Math.sqrt(delta)/2*a;
            System.out.println("Pierwiastami równania kwadratowego są: " + x1 + " oraz " + x2);
        }


    }


}