
public class Lab_04_02 {

    public static void main(String[] args) {

        int[] tablica1 = {-142, 98, 6, -114, 54, -38, 72, -64, -120, 46};
        int[] tablica2 = {-127, 51, -77, 139, 93, -109,77, 115, 53, -99, -33};

        System.out.println("Tablica1: ");
        for(int i = 0; i < tablica1.length; i=i+2){
            System.out.println(tablica1[i+1]+", ");
        }

        System.out.println("Tablica2: ");
        for(int i = 0; i < tablica2.length; i=i+2){
            System.out.println(tablica2[i]+", ");
        }



    }


}//koniec klasy
