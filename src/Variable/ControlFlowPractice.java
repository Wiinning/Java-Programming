package Variable;

import java.util.Scanner;

public class ControlFlowPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("👉 Insert Math Score: ");
        double mathScore = scanner.nextDouble();
        System.out.print("👉 Insert Khmer score: ");
        double khmerScore = scanner.nextDouble();
        System.out.print("👉 Insert English score: ");
        double englishScore = scanner.nextDouble();
        System.out.print("👉 Insert physics score: ");
        double physicScore = scanner.nextDouble();

        double average = (mathScore+khmerScore+englishScore+physicScore)/4;
        System.out.println(average);

        //condition
        if (average>=90){
            System.out.println("Your grade is A !");
        }
        else if (average>=80){
            System.out.println("Your grade is B !");


    }
        else if (average >=70){
            System.out.println("Your grade is C");
}
        else if(average >=60){
            System.out.println("Your grade is D");
        }
        else if (average >=50){
            System.out.println("your grade is E");
        }
        else{
            System.out.println("You'd failed the test");
        }
    }}
