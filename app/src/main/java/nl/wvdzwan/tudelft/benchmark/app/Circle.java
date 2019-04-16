package nl.wvdzwan.tudelft.benchmark.app;


import nl.wvdzwan.tudelft.benchmark.core.AreaInterface;

public class Circle implements AreaInterface {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}