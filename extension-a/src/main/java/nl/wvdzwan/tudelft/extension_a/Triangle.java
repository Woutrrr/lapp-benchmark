package nl.wvdzwan.tudelft.extension_a;

import nl.wvdzwan.tudelft.benchmark.core.AreaInterface;

public class Triangle implements AreaInterface {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double area() {
        return sub_calculation();
    }

    private double sub_calculation() {
        return 0.5 * base * height;
    }
}