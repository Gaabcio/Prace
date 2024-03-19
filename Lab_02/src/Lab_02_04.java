import java.util.Scanner;

public class Lab_02_04 {
    public static void main(String[] args) {
        System.out.println("Czy pada deszcz? [tak(1) lub nie(0)]");
        boolean deszcz = inputBoolean();
        System.out.println("Czy jest autobus? (tak(1) lub nie(0)");
        boolean autobus = inputBoolean();

        OperatoryLogiczne(deszcz, autobus);

    }

    public static boolean inputBoolean(){ //pobiera wartość boolean
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input == 1;
    }
    public static void OperatoryLogiczne(boolean deszcz, boolean autobus){
        if(deszcz && autobus){
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        }
        if(deszcz && !autobus){
            System.out.println("Nie dostaniesz się na uczelnię");
        }
        if(!deszcz && autobus){
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("MIłego dnia i pięknej pogody");
        }
    }


}