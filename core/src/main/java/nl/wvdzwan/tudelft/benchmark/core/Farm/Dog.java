package nl.wvdzwan.tudelft.benchmark.core.Farm;

public class Dog extends Mammal {
    @Override
    public void feed() {
        System.out.println("Woof");
    }

    @Override
    public void move(int distance) {
        System.out.println("Take a step");

        distance--;

        if (distance > 0) {
            move(distance);
        }
    }
    @Override
    public void sleep(int time) {
        System.out.println("sleep");
    }
}
