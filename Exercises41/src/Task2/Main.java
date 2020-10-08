package Task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(2,1,2));
        rooms.add(new Room(1,2,4));
        rooms.add(new Room(3,4,2));
        Building building1 = new Building(14, 4, true, rooms);

        int sumOfLamps = 0;
        for (Room room : rooms) {
            sumOfLamps += room.getNumberOfLamps();

        }
        System.out.println(sumOfLamps);

        if (building1.getNumberOfFloors()>rooms.size()){
            System.out.println("This is an odd building");
        }
    }
}
