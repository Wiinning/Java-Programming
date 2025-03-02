package Method;

public class MethodHasReturnTypeParameter {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int ...numbers){
        // int...numbers is called varargs
        // varargs allows a method to accept a variable of arguments of the same data type
        int sum = 0;
        for(int a: numbers) {
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String[]args){
        int resultOfSum = sum(2, 3);
        int newSum = sum(2,4,5);
        System.out.println("Sum " + resultOfSum);
        System.out.println("New sum " + newSum);
    }
}
