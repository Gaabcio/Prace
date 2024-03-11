import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Podaj wartość x: ");
        int x = inputInt();
        Obliczenia_ax(x);
        Obliczenia_bx(x);
        Obliczenia_cx(x);
    }

    public static int inputInt(){ //pobiera liczbe
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void Obliczenia_ax(double x){

        if(x>0){
            x = 2*x;
        }
        else if(x==0) {
            x = 0;
        }
        else{
            x = -3 * x;
        }
        System.out.println("a(x)= "+ x);
    }

    public static void Obliczenia_bx(double x){

        if(x>=0){
            x = Math.pow(x, 2);
        }

        System.out.println("b(x)= "+ x);
    }

    public static void Obliczenia_cx(double x){

        if(x>2){
            x = 2+x;
        }
        else if(x==2) {
            x = 8;
        }
        else{
            x = x-4;
        }
        System.out.println("c(x)= "+ x);
    }
}