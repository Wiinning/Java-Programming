package Variable;

import java.util.Scanner;
public class test {

    public static void main(String[] args) {
    System.out.print("Insert student's name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.print("✌️ insert math score: ");
    Double mathScore = scanner.nextDouble();
    System.out.print("✌️ insert khmer score: ");
    Double khmerScore = scanner.nextDouble();
    System.out.print("✌️ insert english score: ");
    Double englishScore = scanner.nextDouble();

    Double average = (mathScore+khmerScore+englishScore)/3;

    //display
        System.out.print("👉 student's name: "+ name);
        System.out.print("👉 student's average score is: "+ average);
    }

}
