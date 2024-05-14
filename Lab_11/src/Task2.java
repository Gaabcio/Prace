import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Task2 {
        public static void main(String[] args) throws IOException{

                System.out.println("Podaj ścieżkę do pliku: ");
                Scanner input = new Scanner(System.in);

                File file = new File(input.nextLine());
                int iloscLinii = 0;

                try {
                        Scanner odczyt = new Scanner(file);
                        while (odczyt.hasNextLine()) {
                                String zdanie = odczyt.nextLine();
                                System.out.println(zdanie);
                                iloscLinii++;
                        }
                        System.out.println("Ilość linijek: "+iloscLinii);
                        odczyt.close();
                }
                catch (FileNotFoundException e) {
                        System.out.println("Brak pliku do odczytu!");
                }

        }

        }
