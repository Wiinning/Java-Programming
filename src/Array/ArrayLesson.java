package Array;

import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
//        String [] names = {"sok", "jame", "josh", "june", "jack"};
//        System.out.println(Arrays.toString(names)); //printing all elements of array
//
//        // print one by one
//        for (String name: names){
//            System.out.println(name);
//        }
        String [] names = new String[4];
        names [0] = "James";
        names[1] = "John";
        names[2]= "Josh";
        names [3]= "Jack";
        System.out.println("Array size: " + names.length);
        for (int i= 0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
