package Mini1;

import java.util.ArrayList;

public class Room {
    private String RoomID;
    private String RoomName;
    private String Description;
    private ArrayList<Exit> Exits;
    private boolean Visited;

    public Room(String roomID, String roomName, String description, ArrayList<Exit> exits, boolean visited) {
        this.RoomID = roomID;
        this.RoomName = roomName;
        this.Description = description;
        this.Exits = exits;
        this.Visited = visited;
    }
    public Room(String roomID, String roomName, String description, ArrayList<Exit> exits) {
        this.RoomID = roomID;
        this.RoomName = roomName;
        this.Description = description;
        this.Exits = exits;
    }
    public Room(){
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ArrayList<Exit> getExits() {
        return Exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        Exits = exits;
    }

    public boolean isVisited() {
        return Visited;
    }

    public void setVisited(boolean visited) {
        Visited = visited;
    }

    public String getRoomID() {
        return RoomID;
    }

    public void setRoomID(String roomID) {
        RoomID = roomID;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomID='" + RoomID + '\'' +
                ", RoomName='" + RoomName + '\'' +
                ", Description='" + Description + '\'' +
                ", Exits=" + Exits +
                ", Visited=" + Visited +
                '}';
    }
}
