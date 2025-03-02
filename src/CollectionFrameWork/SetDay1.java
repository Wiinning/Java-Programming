package CollectionFrameWork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDay1 {

    public static void main(String[] args) {
        //working with multiple set

        Set<String> originalName = new HashSet<>(
                List.of("lisa", "jennie")
        );
        Set<String> names = new HashSet<>(
                List.of("lisa", "jennie")
        );

        if(originalName.containsAll(names)){

            System.out.println("The sets are the same");
        }
        // remove
        names.addAll(originalName);
        System.out.println(names);
        // check size
        System.out.println(names.size());


 //        Set<String> stringSet = new HashSet<>(List.of("winwin"));
//        //add
//        stringSet.add("lisa");
//        stringSet.add("jay");
//        stringSet.add("jay");
//        // remove by index
//        stringSet.remove("winwin");
//        //
//        System.out.println(stringSet);

    }
}
