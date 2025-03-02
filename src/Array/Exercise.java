package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("All numbers");
        Integer [] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));
        System.out.println("[+] Insert any element to delete: ");
        int deleteNum = new Scanner(System.in).nextInt();
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]==deleteNum){
                numbers[i] = null;
            }
        }
        System.out.println("All elements after deleted");
        for(Integer n: numbers){
            if (n!= null){
                System.out.println(n);
            }
        }


    }
}
