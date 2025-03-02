package CollectionFrameWork;

import java.util.List;
import java.util.Vector;

public class VectorDay1 {
    public static void main(String[] args) {
        Vector<Integer> vector =
                new Vector<>(List.of(1,2,3,4,5,6,7));
        // remove by index
        vector.remove(0);
        vector.removeLast();
        vector.removeFirst();
        // update by index
        vector.set(1,200);
        // get by Index
        vector.get(4);
        vector.getFirst();
        vector.getLast();
        //
        vector.forEach(e-> System.out.println(e));

    }
}
