package CollectionFrameWork;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetD1 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        // add element to set
        names.add("Jennie");
        names.add("Lisa");
        names.add("Rose");
        names.add("Jisoo");

        //get element
        for(String name : names){
            System.out.println("Name: " + name);
        }
    }
}
