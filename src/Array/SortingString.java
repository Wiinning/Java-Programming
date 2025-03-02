package Array;

import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String [] names = {"Jennie", "Rose", "Lisa", "Lisa", "Rose", "Jisoo"};
Arrays.sort(names);
        System.out.println("Sorted names:" + Arrays.toString(names));
        // checking for duplicate names

        for(int i=0; i < names.length-1; i++){
            if(names[i].equalsIgnoreCase(names[i+1])){
                System.out.println(" Duplicated names are: "+ names[i]);
            }
        }
    }
}
