package Mini1;

import java.util.ArrayList;

public class Room {
    private String RoomID;
    private String RoomName;
    private ArrayList<String> Description;
    private ArrayList<Exit> Exits;
    private boolean Visited;

    public Room(String roomID, String roomName, ArrayList<String> description, ArrayList<Exit> exits, boolean visited) {
        RoomID = roomID;
        RoomName = roomName;
        Description = description;
        Exits = exits;
        Visited = visited;
    }
    public Room(String roomID, String roomName, ArrayList<String> description, ArrayList<Exit> exits) {
        RoomID = roomID;
        RoomName = roomName;
        Description = description;
        Exits = exits;
    }
    public Room(){
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public ArrayList<String> getDescription() {
        return Description;
    }

    public void setDescription(ArrayList<String> description) {
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
}
