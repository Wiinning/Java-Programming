package Method;

import java.util.Arrays;

public class MethodSplitString {
    private static String [] mySplit(String data, String delimeter){
        return data.split(delimeter);
    }
    public static void main(String[] args) {
        String data = "HELLO, World";
        String[] resultOfSplit = mySplit(data, ",");
        System.out.println(Arrays.toString(resultOfSplit));
        System.out.println(resultOfSplit[0]);
        System.out.println(resultOfSplit[1]);
    }
}
