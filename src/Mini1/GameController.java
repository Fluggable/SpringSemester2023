package Mini1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class GameController {
    public final File file = new File("C:/Users/tedto/IdeaProjects/SpringSemester2023/src/Mini1/datafile.txt");
    public static ArrayList<Room> map;

    public GameController() {

    }

    public ArrayList<Room> getMap() {
        Scanner myReader;
        ArrayList<String> lah = new ArrayList<>();
        try {
            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String dataline = myReader.nextLine();
                lah.add(dataline);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String roomid;
        String roomname;
        String desc;
        ArrayList<Exit> exits = new ArrayList<Exit>();
        Exit exit = new Exit();
        Room room = new Room();
        ArrayList<Room> map = new ArrayList<Room>();

        for (String line : lah) {
            if (line.startsWith("ID")) {
                roomid = line.substring(5);
                room.setRoomID(roomid);
                //System.out.println(room.getRoomID());

            }
            if (line.startsWith("Room name")) {
                roomname = line.substring(11);
                room.setRoomName(roomname);
                //System.out.println(room.getRoomName());
            }
            if(line.startsWith("Desc")){
                desc = line.substring(13);
                room.setDescription(desc);
                //System.out.println(room.getDescription());
            }
            if (line.startsWith("exit")){
                String temp1 = line.substring(7);
                String[] temp2 = temp1.split(",");
                for(String exit0:temp2){
                    exit.setDestination(exit0.substring(exit0.length()-1,exit0.length()));
                    exit.setDirection("testdirr");
                }
//                exits.add(exit);
//                room.setExits(exits);
//                map.add(room);
                }
            }
        return map;
        }
    }
