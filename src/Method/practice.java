package Method;

public class practice {
    public static void sumOfNum(int [] array){
        int sum =0;
        for (int i: array){
            sum+=i;

        }
        System.out.println("Sum of array is: " + sum);
    }
    public static void main(String[] args) {
        sumOfNum(new int[]{2, 3, 4, 5});

    }
}
