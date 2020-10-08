package Task3;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    public void createAnimals() {
        animals = new ArrayList<>();
        //animals.add(new Animal(2));
        //animals.add(new Animal(4));
        //animals.add(new Animal(1000));
    }
    public void addAnimal(Animal numberOfLegs) {
        animals.add(numberOfLegs);
    }
    public void makeAllSounds() {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeSound();
        }

    }
    public int printNumberOfLegs(){
        int totalLegs = 0;
        for (int i = 0; i < animals.size(); i++) {
            totalLegs += animals.get(i).getNumberOfLegs();
        }
        return totalLegs;
    }
}
