package nl.wvdzwan.tudelft.benchmark.core;

class Square implements AreaInterface {

    private final double length;
    private final double width;

    public Square (double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double area() {
        return length * width;
    }
}