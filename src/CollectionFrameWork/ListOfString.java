package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("[+] Insert number of name: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Insert Name " + (i+1) );
            String name = new Scanner(System.in).nextLine();
            // add name to array list
            names.add(name);
        }
        names.forEach(e -> System.out.println("Name: " + e));
        // start update
        System.out.println("Insert the name you want to update: ");
        String name = new Scanner(System.in).nextLine();

        // update
        int index = names.indexOf(name);
        if (index>=0){
            System.out.println("Insert new name: ");
            String newName = new Scanner(System.in).nextLine();

            names.set(index, newName);
            names.forEach(e-> System.out.println("Name " + e));
        }else{
            System.out.println("Name Not Found!");
        }

        // start remove or delete
//        int index = names.indexOf(name);
//        if (index>=0){
//            names.remove(index);
//            System.out.println("The name " + name + " has been successfully removed");
//            names.forEach(System.out::println);
//        }else{
//            System.out.println("Name Not Found");
//        }

    }
}
