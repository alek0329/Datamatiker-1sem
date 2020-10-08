package Task3;

public class Kangaroo extends Animal {

    public Kangaroo(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("Kangaroo goes Flop Flop Flop");
    }
}