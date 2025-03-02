package Operator;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args)
            throws InterruptedException {
        System.out.println("[+ ] Insert number of loop");
        int a = new Scanner(System.in).nextInt();


        for (int i = 0; i < 100; i++) {
            System.out.println("My name [ " + (i+1) + " ] ");
            Thread.sleep(500);

        }
    }
}

