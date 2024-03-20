public class Lab_04_07 {

    public static void main(String[] args)
    {

        if(CzyJestToSamo()){
            System.out.println("Tablice są takie same!");
        }
        else{
            System.out.println("Tablice nie są takie same!");
        }

    }



    public static boolean CzyJestToSamo()
    {
        String[] slowa_1 = new String[]{"Ala", "ma", "kota", "a", "kot", "Ale"};
        String[] slowa_2 = new String[]{"Ala", "ma", "kota", "a", "kot", "Ale"};

        for(int i = 0; i < slowa_1.length; i++)
        {
            if(slowa_1[i] != slowa_2[i])
            {
            return false;
            }
        }
            return true;
    }
}//koniec klasy
