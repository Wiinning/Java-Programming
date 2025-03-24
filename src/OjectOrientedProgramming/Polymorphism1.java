package OjectOrientedProgramming;
interface Service1 {
    default void test(){};
    void
    convertRielToDollar (Double riel);
    void
    convertDollarToRiel(Double dollar);
}
class CurrencyExchange implements
        Service1{
    @Override
    public void
    convertRielToDollar(Double riel)
    {
        System.out.println("Result of dollar: " + (riel/4000));
    }
    @Override
    public void
    convertDollarToRiel (Double dollar){
        System.out.println("Result in riel: " + (dollar*4000));
    }

}

public class Polymorphism1 {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.convertDollarToRiel(90d);
        currencyExchange.convertRielToDollar(9800d);
    }
}
