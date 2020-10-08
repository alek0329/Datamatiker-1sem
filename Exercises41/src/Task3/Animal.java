package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Animal implements AnimalSound {
    private int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;

    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}

