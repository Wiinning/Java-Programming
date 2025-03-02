package CollectionFrameWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDay1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        //adding new element to array list
        integerArrayList.add(1);
        integerArrayList.add(9);
        integerArrayList.add(80);
        integerArrayList.add(90);
        //removing element from list in this case we're removing number 9
        integerArrayList.remove(1);
        //update element in list in this case we're replacing number 1 which is in index 0 with number 200
        integerArrayList.set(0,200);
        // get element from array list
        System.out.println(integerArrayList.getFirst());
        System.out.println(integerArrayList.getLast());
        System.out.println(integerArrayList.get(0)); // same as .getFirst can use either which
        System.out.println(integerArrayList.get(1));
        System.out.println(integerArrayList);
    }

}
