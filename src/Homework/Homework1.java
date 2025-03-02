package Homework;

import static javax.management.Query.or;

public class Homework1 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= 5; i++) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // no.2
        System.out.println("""
                    1
                   1 2
                  1 2 3
                 1 2 3 4
                1 2 3 4 5
                """);
        //no.3
        System.out.println("""
                      1
                    2  3
                   4  5  6
                  7  8  9  10 
                11 12 13 14 15
               
                """);
        // no.4
        System.out.println("""
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
                """);

    }
}
