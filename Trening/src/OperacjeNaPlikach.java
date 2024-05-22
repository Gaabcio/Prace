import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
public class OperacjeNaPlikach {
    public static void main(String[] args) {



        try
        {
            File plik = new File("plik.txt");
            if(plik.createNewFile()){
                System.out.println("Plik stworzony!");
            }
            else {
                System.out.println("Plik już utworzony!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Wystąpił błąd!");
            e.getStackTrace();
        }

        try
        {

            FileWriter ZapisDoPliku = new FileWriter("plik.txt");
            ZapisDoPliku.write("Zapisuje dane do pliku!");
            ZapisDoPliku.close();
        }
        catch (IOException e)
        {
            System.out.println("Nastąpił błąd!");
        }

        try{
            File plik = new File("plik.txt");
            Scanner input = new Scanner(plik);
            while(input.hasNextLine()){
                String dane = input.nextLine();
                System.out.println("Dane z pliku: " + dane);
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("nie ma pliku");
        }
    }
}
