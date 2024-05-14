public class IsNegative {
    public void CheckIfNegative(int liczba) throws BlednaWartoscDlaSilniException
    {
        if(liczba<=0)
        {
            throw new IllegalArgumentException("Podaj liczbę dodatnią!");
        }
    }
}
