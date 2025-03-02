package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Homework2 {
    public static void displayOption() {
        System.out.println("""
                1. Set up hall
                2. Start booking
                3. Cancel booking
                4. View history
                5. Exit
                """);
    }
    //method for displaying seating arrangement
    public static void displaySeats(String[][] hall) {
        System.out.println("\n Seating Arrangement: ");
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                System.out.print(hall[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //method for booking seat
    public static void bookSeat(String[][] hall, String code, List <String> bookedSeats ) {
        boolean seatFound = false;
        boolean alreadyBooked = false;
        //This ensures that even if the user input lowercase letter, it will automatically convert it to uppercase and continues to compare.
        String formattedCode = code.toUpperCase();

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                String[] splitCode = hall[i][j].split(":");
                if (splitCode[0].trim().equalsIgnoreCase(code)) {
                    seatFound = true;
                    if (splitCode[1].trim().equalsIgnoreCase("AVAILABLE")) {
                        hall[i][j] = splitCode[0] + " : BOOKED"; // marked as booked
                        bookedSeats.add(formattedCode); //add to list
                        System.out.println("✅ Seat " + formattedCode + " is successfully booked!");
                    } else {
                        alreadyBooked = true;
                    }
                    break; // exit loop once seat is found
                }
            }
            if (seatFound)
                break;
        }
        if (!seatFound) {
            System.out.println("❌ Invalid seat code. Please try again!");

        } else if (alreadyBooked) {
            System.out.println("🔷 The seat " + formattedCode + " that you entered is already booked!");
        }
    }
    // method for cancel booking
    public static void cancelBooking(String [][] hall, String code, List <String> bookedSeats, List <String> canceledSeats){
        boolean seatFound = false;
        boolean notBooked = false;
        // convert the code to uppercase for case insensitivity.
        String formattedCode = code.toUpperCase();

        for(int i=0; i< hall.length; i++){
            for(int j=0; j<hall[i].length; j++){
                String [] splitCode = hall[i][j].split(":");
                if(splitCode[0].trim().equalsIgnoreCase(formattedCode)){
                    seatFound=true;
                    if(splitCode[1].trim().equalsIgnoreCase("BOOKED")){
                        hall[i][j] = splitCode[0] + " : AVAILABLE"; // marked back as AV
                        bookedSeats.removeIf(seat -> seat.equalsIgnoreCase(formattedCode)); // remove from list
                        canceledSeats.add(formattedCode); // add to canceled list
                        System.out.println("✅Your seat " + formattedCode + " has been successfully canceled!");
                    }else{
                        notBooked=true;
                    }
                    break; //exit loop
                }
            }
            if(seatFound)
                break; // exit loop
            }
        if (!seatFound) {
            System.out.println("❌Invalid seat code. Try again!");
        }
        else if (notBooked){
                System.out.println("🔷The seat " + formattedCode + " was not yet booked!");
            }
        }
// method for viewing history
    public static void viewHistory(List <String> bookedSeats, List <String> canceledSeats){
        System.out.println("\n ==== Booked Seat History ==== ");
        if(bookedSeats.isEmpty()){
            System.out.println("❗️Booked seat history not found!");
        }else{
            for(String seat : bookedSeats){
                System.out.println(seat);
            }
        }
        System.out.println("\n==== Canceled Seat History ==== ");
        if (canceledSeats.isEmpty()){
            System.out.println("❗️Canceled seat history is not found!");
        }else{
            for(String seat : canceledSeats){
                System.out.println(seat);
            }
        }
    }
    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> bookedSeats = new ArrayList<>();
        List <String> canceledSeats = new ArrayList<>();
        String[][] hall = null;
        while (true) {
            displayOption();
            System.out.print("👉Please pick an option: ");
            int option;
            try{
                option = Integer.parseInt(scanner.nextLine().trim());
            }catch(NumberFormatException a){
                System.out.println("❌Invalid option. Please input a number between 1-5: ");
                continue;
            }
            switch (option) {
                case 1 -> {
                    System.out.print("[+] Insert number of row: ");
                    int rowNum = scanner.nextInt();
                    System.out.print("[+] Insert number of column: ");
                    int columnNum = scanner.nextInt();
                    scanner.nextLine();
                    hall = new String [rowNum][columnNum];
                    char characterSeat = 'A';
                    for (int i = 0; i < hall.length; i++) {
                        for (int j = 0; j < hall[i].length; j++) {
                            hall[i][j] = characterSeat + "-" + (j + 1) + " : AVAILABLE";
                        }
                        characterSeat++;
                    }
                    displaySeats(hall);
                }
                case 2 -> {
                    if(hall == null){
                        System.out.println("❌No hall is set up yet. Please set up the hall first or go to option 1!");
                        break;
                    }
                    while (true) {
                        System.out.print("👉 Please insert seat code to book (e.g.(A-1, B-1) or type 'exit' to quit: ");
                        String seatCode = scanner.nextLine().trim();
                        if (seatCode.equalsIgnoreCase("exit")) {
                            System.out.println("🙏Thank you for booking with us!");
                            break;
                        }
                        bookSeat(hall, seatCode, bookedSeats);
                        displaySeats(hall);
                    }
                }
                case 3-> {
                    if (hall == null || bookedSeats.isEmpty()){
                        System.out.println("❗️No booked seats to cancel");
                        break;
                    }
                    System.out.println("🔷BOOKED SEATS: ");
                    for(String bookedSeat : bookedSeats){
                        System.out.println(bookedSeat);
                    }
                    System.out.println("Which seat do you want to cancel?");
                    String seatCode = scanner.nextLine().trim();
                    if(seatCode.equalsIgnoreCase("exit")){
                        System.out.println("Thank you!🙏");
                        break;
                    }
                    cancelBooking(hall, seatCode, bookedSeats, canceledSeats);
                    displaySeats(hall);
                }
                case 4-> {
                    viewHistory(bookedSeats, canceledSeats);
                }
                case 5->{
                    System.exit(0);
                }
                default -> {
                    System.out.println("❌Invalid Option. Please choose between 1-5.");
                }
            }
        }
    }
}
