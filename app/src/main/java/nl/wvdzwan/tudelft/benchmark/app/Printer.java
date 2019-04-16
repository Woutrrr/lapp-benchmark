package nl.wvdzwan.tudelft.benchmark.app;

import nl.wvdzwan.tudelft.benchmark.core.AreaInterface;

public class Printer implements ShapeOutput {

    @Override
    public void output(AreaInterface shape) {

        System.out.println(shape.area());
    }

    @Override
    public String toString() {
        return "Hoi";
    }

}
