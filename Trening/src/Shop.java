import java.util.ArrayList;
import java.util.List;

class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void displayComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}