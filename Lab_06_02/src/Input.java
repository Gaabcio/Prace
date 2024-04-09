import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public int inputInt() {
        int liczbaInt = input.nextInt();
        return liczbaInt;
    }
    public double inputDouble() {
        double liczbaDouble = input.nextDouble();
        return liczbaDouble;
    }

    public String inputChar() {
        String znak = input.next();
        return znak;
    }
}
