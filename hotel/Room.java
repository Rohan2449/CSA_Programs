package hotel;

public class Room{
    private int roomNumber;
    private int daysRented;
    private String roomType;
    private String occupantName;
    public Room(int roomNum, String roomT){
        daysRented = 0;
        roomNumber = roomNum;
        occupantName = null;
        if(roomT.equalsIgnoreCase("single king") || roomT.equalsIgnoreCase("suite"))
            roomType = roomT;
        else
            roomType = "double queen";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getOccupantName() {
        return occupantName;
    }

    public boolean setOccupant(String name, int days){
        if(occupantName == null){
            occupantName = name;
            daysRented = days;
            return true;
        }
        else
            return false;
    }
    public void advanceDay(){
        daysRented--;
        if(daysRented <= 0){
            daysRented =0;
            occupantName = null;
        }
    }
    public String toString(){
        if(occupantName != null)
            return "Room " + roomNumber + ": " + roomType + " - rented to "+ occupantName;
        else
            return "Room " + roomNumber + ": " + roomType + " - free";

    }
}