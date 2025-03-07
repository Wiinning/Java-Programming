package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
    private static final Map<Integer, String> studentInfo = new HashMap<>();
   private static final Scanner scanner = new Scanner(System.in);

    private static boolean addNewStudentName (String studentName){
        int key;
        Random random = new Random();
        do{
            key = random.nextInt(9999);
        }while(studentInfo.containsKey(key));
        studentInfo.put(key, studentName);
        System.out.println("Student added successfully with ID: " + key);
        return true;
    }
    private static boolean removeStudentByID(int id){
        if(studentInfo.containsKey(id)){
            studentInfo.remove(id);
            System.out.println("Student with ID: " + id + " has been removed.");
            return true;
        }else{
            System.out.println("Student with ID: " + id + " was not found.");
            return false;
        }
    }
    private static boolean updateStudentByID(int id, String newName){
        if(studentInfo.containsKey(id)){
            studentInfo.put(id,newName);
            System.out.print("Student with ID: " + id + " info has been updated.");
            scanner.nextLine();
            return true;
        }else{
            System.out.println("Student ID: " + id + " was not found.");
            return false;
        }
    }
    private static void searchStudentByID (int id){
        if(studentInfo.containsKey(id)){
            System.out.println("Student with ID: " + id + " -> " + studentInfo.get(id));
        }else{
            System.out.println("Student with ID: " + id + " was not found.");
        }
    }
    private static void home () {
        while (true) {
            System.out.println("=".repeat(40));
            System.out.println("Welcome to Student Management");
            System.out.println("=".repeat(40));
            System.out.println("""
                    1. Add student name
                    2. Search by id
                    3. Delete student by ID
                    4. Update student by ID
                    5. Exit
                    """);
            System.out.print("Insert Option: ");
            int option;
            try{
                option = Integer.parseInt(scanner.nextLine().trim());
            }catch(NumberFormatException e){
                System.out.println("Invalid Option. Please Enter a number between 1 and 5 to proceed.");
                continue;
            }
            switch (option) {
                case 1 -> {
                    System.out.println("=".repeat(15));
                    System.out.println("Student Record");
                    System.out.println("=".repeat(15));

                    System.out.print("Insert Student Name to record: ");
                    String name = scanner.nextLine();
                    boolean isInserted = addNewStudentName(name);
                    System.out.println(studentInfo);
                }
                case 2 -> {
                    System.out.println("=".repeat(20));
                    System.out.println("Search Student By ID");
                    System.out.println("=".repeat(20));

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    searchStudentByID(id);
                }
                case 3 -> {
                    System.out.println("=".repeat(20));
                    System.out.println("Delete Student by ID");
                    System.out.println("=".repeat(20));
                    System.out.print("Enter Student ID to Delete: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    removeStudentByID(removeId);
                }
                case 4 -> {
                    System.out.println("=".repeat(20));
                    System.out.println("Update Student by ID: ");
                    System.out.println("=".repeat(20));

                    System.out.print("Enter Student ID you want to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Student Name: ");
                    String newName = scanner.nextLine();
                    updateStudentByID(id, newName);
                }
                case 5 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();

    }
}
