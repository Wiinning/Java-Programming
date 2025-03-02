package Operator;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert option: ");
        int number = scanner.nextInt();
        switch (number){
            case 1: {
                System.out.println("This is option 1 ");
               break;
            }
            case 2: {
                System.out.println("This is option 2: ");
                break;
            }
            case 3: {
                System.out.println("This is option 3:");
                break;
            }
            default: {
                System.out.println("No option");
            }
        }
    }
}
