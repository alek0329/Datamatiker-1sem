package Task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Building {
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private ArrayList<Room> rooms;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, ArrayList<Room>rooms) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;
    }

    public int getNumberOfBathrooms() {

        return numberOfBathrooms;
    }
    public int getNumberOfFloors() {

        return numberOfFloors;
    }
    public boolean isOfficeBuilding() {

        return isOfficeBuilding;
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
