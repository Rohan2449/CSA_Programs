package hotel;

public class Hotel {
    private String hotelName;
    private Room[] rooms;
    private int totalRooms;

    public Hotel(String hotelName, int totalRooms, int floors){
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        rooms = new Room[this.totalRooms];

        String roomType = "";
        int roomsPerFloor = totalRooms / floors;
        int roomNumber = 99;
        int floor = 1;
        for(int i =0; i < this.totalRooms; i++){

            if(roomNumber <= 99-roomsPerFloor){
                roomNumber = 99;
                floor++;
            }

            if(roomNumber == 99){
                roomType = "suite";
            } else if(roomNumber > 94){
                roomType = "single king";
            } else {
                roomType = "double queen";
            }

            rooms[i] = new Room(roomNumber + floor*100, roomType);
            roomNumber--;



        }
    }
    public int getTotalRooms(){
        return totalRooms;
    }
    public int getNumberOccupied(){
        int count = totalRooms;
        for(Room r: rooms) {
            if (r.getOccupantName() == null) {
                count--;
            }
        }
        return count;
    }
    public double getOccupancy(){
        double occupants = (double) this.getNumberOccupied();
        double rate = occupants/this.totalRooms;
        rate = (double)Math.round(rate*100)/100;
        return rate;
    }
    public boolean rentRoom(String roomType, String occupantName, int stayDays){
            for(Room r: rooms){
                if(r.getOccupantName() == null && r.getRoomType().equalsIgnoreCase(roomType)){
                    r.setOccupant(occupantName, stayDays);
                    return true;
                }
            }
        return false;
    }

    public void advanceDay(){
        for(Room r: rooms){
            r.advanceDay();
        }
    }

    public String toString(){
        return hotelName +": "+ (int)(getOccupancy()*100) + "% occupied";
    }
    public void printRooms(){
        for(Room r: rooms){
            System.out.println(r.toString());
        }
    }
}
