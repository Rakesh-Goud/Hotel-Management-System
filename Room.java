// Room.java
public abstract class Room {
    protected int roomNumber;
    protected String roomType;
    protected boolean isAvailable;

    // Constructor
    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true; // Room is available by default
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    // Abstract method to be implemented by subclasses to get room price
    public abstract double getPrice();

    // Display room details
    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: $" + getPrice());
        System.out.println("Availability: " + (isAvailable ? "Available" : "Booked"));
    }
}
