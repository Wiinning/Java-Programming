package Operator;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(40));
            System.out.println("""
                    -------- Food Panda ---------
                    
                    """);
            System.out.println("=".repeat(40));
            System.out.println("""
                    1. View all products
                    2. View cart
                    3. Start Order
                    4. View Ordered History
                    5. Exit
                    """);
            System.out.println("=".repeat(40));
            System.out.print("[+] Insert Option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.println("View all product");
                case 2 -> System.out.println("view cart");
                case 3 -> System.out.println("Start order");
                case 4 -> System.out.println("view order history");
                case 5 -> System.out.println("exit");

                default -> System.exit(0);


            }
        }
    }
}
