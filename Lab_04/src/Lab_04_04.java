public class Lab_04_04 {

    public static void main(String[] args) {

       String[] slowa = new String[] {"Ala","ma","kota","i","psa"};


       for(int i = slowa.length - 1; i >= 0; i--)
       {
           System.out.println(new StringBuilder(slowa[i]).reverse());
       }



    }


}//koniec klasy