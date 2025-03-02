package IntroductionJava;

import java.util.Scanner;

public class input {
    public static void main(String[]args){

        System.out.print("[+] Insert your name: ");
        String name = new Scanner(System.in).nextLine();
        int age = new Scanner(System.in).nextInt();

        System.out.println("=".repeat(10));
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);

    }
}
