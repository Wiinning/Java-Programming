package CollectionFrameWork;

import java.util.TreeMap;

public class TreeMapNoNull {
    public static void main(String[] args) {
        TreeMap<Integer, String> names = new TreeMap<>();
        //cannot store null value
        names.put(1, "Win");
        names.put(null, " ");

        names.put(1, "Sam");
        names.put(2, null);
    }

}
