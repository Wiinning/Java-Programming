package twoDarray;

import java.util.Scanner;

public class CreatingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Single Scanner instance

        // Get hall size from user
        System.out.println("+ Insert number of rows: ");
        int rowNum = scanner.nextInt();
        System.out.println("+ Insert number of columns: ");
        int columnNum = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Initialize hall
        String[][] hall = new String[rowNum][columnNum];

        // Generate seat codes (e.g., A-1 :AV)
        char characterSeat = 'A';
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = characterSeat + "-" + (j + 1) + " : AV";
            }
            characterSeat++;
        }

        // Display initial seat arrangement
        displaySeats(hall);

        // Booking loop
        while (true) {
            System.out.print("[+] Insert seat code to book (A-1, B-1) or type 'exit' to quit: ");
            String code = scanner.nextLine().trim();

            if (code.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for booking with us!");
                break;
            }

            boolean seatFound = false;
            boolean alreadyBooked = false;

            // Search for seat code
            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    String[] splitCode = hall[i][j].split(":");
                    if (splitCode[0].trim().equalsIgnoreCase(code)) {
                        seatFound = true;
                        if (splitCode[1].trim().equals("AV")) {
                            hall[i][j] = splitCode[0] + " :BO"; // Mark as booked
                            System.out.println("✔ Seat " + code + " successfully booked!");
                        } else {
                            alreadyBooked = true;
                        }
                    }
                }
            }

            // Handle cases
            if (!seatFound) {
                System.out.println("⚠ Invalid seat code. Please try again.");
            } else if (alreadyBooked) {
                System.out.println("❌ Seat " + code + " is already booked!");
            }

            // Display updated seats
            displaySeats(hall);
        }

        scanner.close(); // Close scanner
    }

    // Method to display seats properly
    private static void displaySeats(String[][] hall) {
        System.out.println("\nSeating Arrangement:");
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                System.out.print(hall[i][j] + " | ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println();
    }
}
