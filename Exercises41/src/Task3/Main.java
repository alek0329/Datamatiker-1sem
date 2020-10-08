package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.createAnimals();


        Centipede centipede = new Centipede(1000);
        Dog dog = new Dog (4);
        Kangaroo kangaroo = new Kangaroo(2);


        zoo.addAnimal(kangaroo);
        zoo.addAnimal(dog);
        zoo.addAnimal(centipede);


        zoo.makeAllSounds();
        System.out.println("Current legs in Zoo: "+zoo.printNumberOfLegs());

    }

}
