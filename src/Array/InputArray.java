package Array;

import java.util.Scanner;
import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        System.out.print("Insert the number of element: ");
        int number = new Scanner(System.in).nextInt();
        String [] names = new String [number];
        for(int i = 0; i < number; i++){
            System.out.print("Insert name [ " + i + " ]: " );
            names [i] = new Scanner(System.in).nextLine();
        }
        System.out.println("All names");
        System.out.println(Arrays.toString(names));
        System.out.print("Insert old name to update: ");
        String oldName = new Scanner(System.in).nextLine();
        for(int i = 0; i < names.length; i++){
            System.out.print("Insert new name to update: ");
            String newName = new Scanner(System.in).nextLine();
            names [i] = newName;
        }
        System.out.print("Update names: ");
        System.out.print(Arrays.toString(names));
    }
}