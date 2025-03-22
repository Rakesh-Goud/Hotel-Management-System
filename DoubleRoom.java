// DoubleRoom.java
public class DoubleRoom extends Room {

    public DoubleRoom(int roomNumber) {
        super(roomNumber, "Double");
    }

    @Override
    public double getPrice() {
        return 150.0; // Price for double room
    }
}