package Variable;

import java.util.Scanner;

public class VariableLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the difference between primitive datatype and wrapper class
        Short myNewAge = 12; // wrapper class (has method included can be changed to other datatype easily but much bigger ram)
        short age = 13; // primitive datatype (do not have method included and have to write own method)

        //wrapper class
        Short myNewNum = 10;
        Character newGender = 'A';
        Double  price = 2.9;
        Float ff = 2.4f;
        Byte _byte = 2;
        Integer p = 23;
        double result = myNewAge.doubleValue(); // using this method, we changed from Short to double for myNewAge data type
        System.out.println(result);
    }
}
