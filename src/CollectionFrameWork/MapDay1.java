package CollectionFrameWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDay1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //  hashMap cannot have a duplicate key but it can have the same value. If hashMap have the same key, it will take the value of the last key.
        map.put(1, "Apple");
        map.put(2, "Apricot");
        map.put(3, "56");
        map.put(4, "56");
        map.put(5, null);
        map.put(null, null);
        //removing element or value
        map.remove(3, "56");

        Set<Integer> keys = map.keySet();
        System.out.println("All keys: " + keys);
        Collection<String> values = (map.values());
        System.out.println("All values in map " + values);
        // check the size of the map
        System.out.println(map.size());

        System.out.println(map);
// for each with map is a little different from List and Set
        for(Map.Entry<Integer, String> obj : map.entrySet()){
            System.out.println("Key " + obj.getKey());
            System.out.println("Value " + obj.getValue());
        }
    }
}
