package Method;

import java.util.Scanner;

public class Main {
    public static void displayWelcomeMessage(){
        System.out.println("=".repeat(30));
        System.out.println("Welcome to 168 Mart!🤪");
        System.out.println("=".repeat(30));
        System.out.println("""
                1. List all product
                2. Insert new product
                3. Update product
                4. Delete product
                5. Exit
            
                """);
    }
    public static void sum(){
        System.out.println("Insert number A: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Insert number B: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Sum of a+b = " + (a+b));

    }
    public static void findMax (int a, int b){
        if(a>b){
            System.out.println(a + " > " + b);
        }
        if(a<b){
            System.out.println(a + " < " + b);
        }
    }

    public static void main(String[] args) {
        displayWelcomeMessage();
        sum();
        findMax(100,101);


    }
}
