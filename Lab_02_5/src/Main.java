import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Czy jest zniżka? [tak(1) lub nie(0)]");
        boolean znizka = inputBoolean();
        System.out.println("Czy otrzymałeś podwyżkę? (tak(1) lub nie(0)");
        boolean podwyzka = inputBoolean();

        OperatoryLogiczne(znizka, podwyzka);

    }

    public static boolean inputBoolean(){ //pobiera wartość boolean
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input == 1;
    }
    public static void OperatoryLogiczne(boolean znizka, boolean podwyzka){
        if(!znizka || podwyzka){
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochoód nie ma");
        }
        else if(!znizka || !podwyzka){
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
        else if(znizka || podwyzka){
            System.out.println("Możesz kupić samochód");
        }
    }


}