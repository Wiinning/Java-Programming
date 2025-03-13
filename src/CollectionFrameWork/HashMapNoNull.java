package CollectionFrameWork;

import java.util.Hashtable;
import java.util.Map;

public class HashMapNoNull {
    public static void main(String[] args) {
        Map<Integer, String> names = new Hashtable<>();
        names.put(null, "");
        names.put(1, null);
    }
}
