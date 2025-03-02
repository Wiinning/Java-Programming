package Variable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        // relationship operator
        Scanner scanner = new Scanner(System.in);
        System.out.print("[+] insert a: ");
        int a = scanner.nextInt();
        System.out.print("[+] insert b: ");
        int b = scanner.nextInt();

        System.out.println("A>B: "+ (a>b));
        System.out.println("A<B: "+ (a<b));
        System.out.println("A<=B: "+ (a<=b));
        System.out.println("A>=B: "+(a>=b));
        System.out.println("A!=B: "+ (a!=b));
        System.out.println("A == B: "+(a == b));
    }
}
