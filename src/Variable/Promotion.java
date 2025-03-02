package Variable;

public class Promotion {
    public static void main(String[] args) {
        // promotion (from small datatype to bigger datatype)
        int avg = 2;
        double newAvg = avg;
        // casting (vice versa)
        double price = 55.5;
        int singlePrice = (int) price;
        // auto-boxing
        int primitive = 100;
        Integer newWrapper = primitive;
        //unboxing
        Double doubleOfWrapper = 45.5;
        double primitiveDouble = doubleOfWrapper;

    }
}
