// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a hotel with 10 rooms
        HotelManagementSystem hotel = new HotelManagementSystem(10);

        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("1. View All Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Check Room Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hotel.displayAllRooms();
                    break;
                case 2:
                    System.out.print("Enter the room number to book: ");
                    int bookRoomNumber = scanner.nextInt();
                    hotel.bookRoom(bookRoomNumber);
                    break;
                case 3:
                    System.out.print("Enter the room number to check availability: ");
                    int checkRoomNumber = scanner.nextInt();
                    hotel.checkRoomAvailability(checkRoomNumber);
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


