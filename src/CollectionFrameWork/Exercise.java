package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
    private static Map<Integer, String> studentInfo = new HashMap<>();
    private static Boolean addNewStudentName (String studentName){
        int key = new Random().nextInt(9999);
        studentInfo.put(key, studentName);
        return true;
    }
    private static boolean removeStudentByID (int id){
        String value = studentInfo.remove(id);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static void home (){
        System.out.println("""
                1. Add student name
                2. Search by id
                3. Delete student by ID
                4. Update student by ID
                5. Exit
                """);
        System.out.print("Insert Option: ");
        switch (new Scanner(System.in).nextInt()){
            case 1 -> {
                System.out.println("Student Record");
                System.out.println("Insert Student Name to record: ");
                String name = new Scanner(System.in).nextLine();
                boolean isInserted = addNewStudentName(name);
                System.out.println(studentInfo);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(studentInfo);

    }
}
