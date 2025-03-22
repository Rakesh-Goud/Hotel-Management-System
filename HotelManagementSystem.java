// HotelManagementSystem.java
import java.util.Scanner;

public class HotelManagementSystem {
    private Room[] rooms;

    // Constructor to initialize hotel with rooms
    public HotelManagementSystem(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        // Initialize rooms
        for (int i = 0; i < numberOfRooms; i++) {
            if (i % 2 == 0) {
                rooms[i] = new SingleRoom(i + 1); // Even index: Single Room
            } else {
                rooms[i] = new DoubleRoom(i + 1); // Odd index: Double Room
            }
        }
    }

    // Method to book a room
    public void bookRoom(int roomNumber) {
        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number!");
            return;
        }

        Room room = rooms[roomNumber - 1];
        if (room.isAvailable()) {
            room.setAvailability(false);
            System.out.println("Room " + roomNumber + " has been successfully booked.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    // Method to check room availability
    public void checkRoomAvailability(int roomNumber) {
        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number!");
            return;
        }

        Room room = rooms[roomNumber - 1];
        if (room.isAvailable()) {
            System.out.println("Room " + roomNumber + " is available.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    // Method to display all rooms and their details
    public void displayAllRooms() {
        for (Room room : rooms) {
            room.displayRoomDetails();
        }
    }
}


