package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework3 {
private static final Scanner scanner = new Scanner (System.in);
private static final List<String> products = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            displayOpt();
            System.out.print("Enter Your Option: ");
            int opt;
            try {
                opt = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException a) {
                System.out.println("❌Invalid Option. Please Choose an Option between 1 and 5 to proceed!");
                continue;
            }
            switch (opt) {
                case 1 -> addProduct();
                case 2 -> searchProduct();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("❌Invalid Option. Please Choose an Option between 1 and 5 to proceed! ");
                }
            }
        }
    }
    public static void displayOpt() {
        System.out.println("=".repeat(15));
        System.out.println("💁 WELCOME !");
        System.out.println("=".repeat(15));
        System.out.println("""
                1. Add New Product
                2. Search For Product
                3. Update Product
                4. Delete Product
                5. Exit
                """);
    }

    private static void addProduct() {
        System.out.println("=".repeat(25));
        System.out.println("Add New Product");
        System.out.println("=".repeat(25));
        System.out.print("🔷Enter New Product name: ");
        String newProduct = scanner.nextLine();
        products.add(newProduct);
        System.out.println("✅Product has been added successfully!");
    }
    private static void searchProduct() {
        System.out.println("=".repeat(30));
        System.out.println("Search for products");
        System.out.println("=".repeat(30));

        System.out.print("🔷Enter Product Name to Search: ");
        String searchProduct = scanner.nextLine();
        boolean found = false;
        // can also use products.contains but it is case-sensitive.
        for (String product : products) {
            if (product.equalsIgnoreCase(searchProduct)) {
                System.out.println("✅Product Found: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌Product: " + " ' " + searchProduct + " ' " + " was not found");
        }
    }
    private static void updateProduct () {
        System.out.println("=".repeat(20));
        System.out.println("Update Product");
        System.out.println("=".repeat(20));

        System.out.print("🔷Enter existing product name to update: ");
        String oldProduct = scanner.nextLine();
        boolean updated = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equalsIgnoreCase(oldProduct)) {
                System.out.print("🟣Enter New Product: ");
                String newUpdatedProduct = scanner.nextLine();
                products.set(i, newUpdatedProduct);
                System.out.println("✅Product has been successfully updated!");
                updated = true;
                break;
            }
        }
        if(!updated){
            System.out.println("❌Product: " + oldProduct + " was not found");
        }
    }
    private static void deleteProduct(){
        System.out.println("=".repeat(15));
        System.out.println("Delete Product");
        System.out.println("=".repeat(15));

        System.out.print("💙Enter Product Name to Delete: ");
        String deleteProduct = scanner.nextLine();
        boolean deleted = false;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).equalsIgnoreCase(deleteProduct)) {
                products.remove(i);
                System.out.println("🗑️Product has been deleted!");
                deleted = true;
                break;
            }
        }
        if(!deleted){
            System.out.println("❌Product: " + deleteProduct + " was not found.");

        }
    }
}
