package ClassAndObject;
class Math{
    private int sum;
    public int sum (int ... numbers){
        for(int n : numbers){
            sum = sum+n;
        }
        return sum;

    }
}

public class LessonDay1 {
    public static void main(String[] args) {
        Math math = new Math();
        int resultOfSum = math.sum(1, 2, 3, 5, 6);
        System.out.println("Result of Sum: " + resultOfSum);

    }
}
