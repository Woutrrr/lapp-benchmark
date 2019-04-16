package nl.wvdzwan.tudelft.benchmark.core.Farm;

public class Cat extends Mammal {

    @Override
    public void feed() {
        System.out.println("Prrrrr");
    }

    @Override
    public void move(int distance) {
        System.out.println("Nope, I will lay down and sleep");
    }

    @Override
    public void sleep(int time) {
        System.out.println("sleep");
    }
}
