public class IsNegative{
    public void CheckIfNegative(int liczba) throws NotPositiveException
    {
        if(liczba<=0)
        {
            throw new IllegalArgumentException("Podaj liczbę dodatnią!");
        }
    }
}
