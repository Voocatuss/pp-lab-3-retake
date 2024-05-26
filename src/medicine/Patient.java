package medicine;

public class Patient extends Person {
    private String illness;
    private int roomNumber;

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Illness: " + getIllness());
        System.out.println("Room Number: " + getRoomNumber());
    }
}
