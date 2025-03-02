package Operator;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double khmer, math, english;
        System.out.println("[+] insert your khmer score: ");
        khmer= scanner.nextDouble();
        System.out.println("[+] insert your english score: ");
        english = scanner.nextDouble();
        System.out.println("[+] insert your math score: ");
        math = scanner.nextDouble();
        double average = (khmer+english+math)/3;

        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("Thida")){
            System.out.println(name +"has been allowed");
        }

        // condition
        if (average<=100 && average>=90){
            System.out.println("You got grade A");
        }
        else if (average <= 89 && average >=80 ){
            System.out.println("You got grade B");
        }
        else if (average <= 79 && average >=70){
            System.out.println("you got grade C");
        }
        else if (average <= 69 && average >= 60){
            System.out.println("you got grade D");
        }
        else if (average <= 59 && average >= 50){
            System.out.println("you got grade E");
        }
        else{
            System.out.println("you have failed the exam");}
    }


}
// comparing string variable

