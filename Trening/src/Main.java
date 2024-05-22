import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // Dodaj kilka komputerów do sklepu
        shop.addComputer(new Desktop(3000, 16, 1000, 2500));
        shop.addComputer(new Laptop(2500, 8, 512, 3000, 15.6));
        shop.addComputer(new Desktop(3500, 32, 2000, 4000));
        shop.addComputer(new Laptop(2800, 16, 1000, 3500, 13.3));

        // Wyświetl listę komputerów w sklepie
        shop.displayComputers();
    }
}
