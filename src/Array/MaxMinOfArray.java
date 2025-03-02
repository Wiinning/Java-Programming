package Array;

import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String[] args) {

        System.out.println(Math.max(3,2));
        System.out.print("[+] Insert length of array: ");
        int n = new Scanner(System.in).nextInt();
        Integer [] numbers = new Integer[n];
        // insert each array's element
        for(int i=0;i<numbers.length;i++){
            System.out.print("[+] Insert element [" + i + "]: ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int max = numbers[0];
        for(Integer a: numbers){
            if(max<a){
                max = a;
            }
        }
        System.out.println("This is maximum of above array: " + max);
    }
}
