package Mini1;

public class Player {
    private boolean isAlive;
    private String roomID;

    public Player(){

    }
    public Player(boolean isAlive, String roomID){
        isAlive = isAlive;
        roomID = roomID;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
