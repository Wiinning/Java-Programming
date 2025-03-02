package Operator;

import java.util.Scanner;

public class MartUsingSwitchCase {
    public static void main(String[] args) throws InterruptedException {
        while (true){
        System.out.println("💁======= Welcome to my Mart =======✌️");
        System.out.println("1. List all product");
        System.out.println("2. Add new product");
        System.out.println("3. Search products by code");
        System.out.println("4. Delete product");
        System.out.println("5. Exit");
        System.out.println("=".repeat(20));
        Scanner scanner = new Scanner(System.in);
        System.out.print("[+] Insert any option: ");
        int option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("1. List all product.");
                    break;
                }
                case 2: {
                    System.out.println("2. Add new product");
                    break;
                }
                case 3: {
                    System.out.println("3. Search product by code");
                    break;
                }
                case 4: {
                    System.out.println("4. Delete product");
                    break;
                }

                default: {
                    System.out.println("option invalid");
                }
            }
        }
    }
}
