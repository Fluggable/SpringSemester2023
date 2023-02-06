package Mini1;

public class Exit {
    private String direction;
    private String destinationRoom;

    public Exit(){

    }
    public Exit(String direction, String destination){
        direction = direction;
        destination = destination;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDestination() {
        return destinationRoom;
    }

    public void setDestination(String destination) {
        this.destinationRoom = destination;
    }

    @Override
    public String toString() {
        return "Exit{" +
                "direction='" + direction + '\'' +
                ", destinationRoom='" + destinationRoom + '\'' +
                '}';
    }
}
