package Operator;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("[+] insert range of number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfEven = 0;
        int numberOfOdd = 0;
        // we're using for loop since we know the specific amount of loop we want. eg in this case it's given number.
        for (int i =1; i<=number; i++){
            if (i%2==0){
                numberOfEven++;
            }else{
                numberOfOdd++;
            }
        }
        System.out.println("Range of number from (1 to " + number + " )");
        System.out.println("Even " + numberOfEven);
        System.out.println("Odd " + numberOfOdd);


    }
}
