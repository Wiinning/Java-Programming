package Method;

import java.util.Arrays;

public class Practice1 {
    public static void findDuplicateElement(int[] numbers){
        Arrays.sort(numbers);
        for(int i = 0; i< numbers.length-1; i++){
            if(numbers[i]== numbers[i+1]){
                System.out.println("Duplicate numbers: " + numbers[i]);
            }
        }
    }


    public static void main(String[] args) {
        findDuplicateElement(new int[]{2,2,5,6,8,9,7,6,9});

    }

    public static class Varage {
        public static void sum(int ... a){
            int sum = 0;
            for(int n: a){
                sum+=n;
            }
            System.out.println("Sum: " + sum);
        }
        public static void main(String[] args) {
            sum();
            sum(1);
            sum(1,2);
            sum(1,2,3);
            sum(1,2,3,4);


        }
    }
}
