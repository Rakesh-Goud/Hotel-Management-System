// SingleRoom.java
public class SingleRoom extends Room {

    public SingleRoom(int roomNumber) {
        super(roomNumber, "Single");
    }

    @Override
    public double getPrice() {
        return 100.0; // Price for single room
    }
}
