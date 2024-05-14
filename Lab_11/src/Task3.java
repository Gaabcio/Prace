import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException  {

        System.out.println("Podaj nazwę pliku: ");
        Scanner input = new Scanner(System.in);

        DataOutputStream outputStream = null;
        File NazwaPliku = new File(input.nextLine());

        System.out.println("Podaj dzień urodzenia: ");
        int day = input.nextInt();

        System.out.println("Podaj miesiąc urodzenia: ");
        int month = input.nextInt();

        System.out.println("Podaj rok urodzenia: ");
        int year = input.nextInt();






        try{
            outputStream = new DataOutputStream(new FileOutputStream(NazwaPliku));
            outputStream.writeInt(day);
            outputStream.writeInt(month);
            outputStream.writeInt(year);
        }
        finally {
            if(outputStream != null){
                outputStream.close();
            }
        }
    }
}
