package Array;

import java.util.Arrays;

public class ArrayDay2 {
    public static void main(String[] args) {
        int[] num ={-5, -3, -20, 18, 20};
        System.out.println(Arrays.toString(num));

        for(int i=0; i <num.length; i++){
            for(int j=0; j<num.length-1; j++){
                if(num[j] < num[j+1]){
                    int temp = num[j];
                    num[j]= num[j+1];
                    num[j+1]=temp;


                }
            }
        }
        System.out.println(Arrays.toString(num));
        // we can also use
        Arrays.sort(num); // sorting from smaller to bigger number without the hassle
        // if we wanna sort string, we can use TreeSet



    }
}
