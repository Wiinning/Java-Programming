package Method;

import java.util.Scanner;

public class noParamaterHaveReturnType {
    public static int sum(){
        System.out.println("insert a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("insert b: ");
        int b = new Scanner(System.in).nextInt();
        return a+b;
    }

    public static void main(String[] args) {
       int result = sum();
        System.out.println("Sum: " + result);
    }


}
