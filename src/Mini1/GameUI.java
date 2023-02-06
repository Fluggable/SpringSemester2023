package Mini1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class GameUI extends GameController{
    public static boolean isValidMove(String userInput, Player player, ArrayList<Room> rooms) {
        return true;
    }

    public static void movePlayer(String userInput, Player player, ArrayList<Room> rooms) {

    }

    public static void printCurrentRoom(Player player, ArrayList<Room> rooms) {

    }

    public static void printEnd(int location, ArrayList<Room> rooms) {

    }

    public static void main(String[] args) {
        GameController gameController = new GameController();
        ArrayList<Room> map = gameController.getMap();
//        for (Room room:map){
//            System.out.println(room.getRoomID());
//        }
    }
}