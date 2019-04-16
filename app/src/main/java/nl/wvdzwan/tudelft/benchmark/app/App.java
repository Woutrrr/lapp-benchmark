package nl.wvdzwan.tudelft.benchmark.app;

import nl.wvdzwan.tudelft.benchmark.core.AreaInterface;
import nl.wvdzwan.tudelft.extension_a.Triangle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

   public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        ShapeOutput printer = new Printer();

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(10, 10);

        printer.output(circle);
        printer.output(triangle);
        printer.output(new Hexagon(3));

        triangle.area();

        privateCall(triangle);

    }

    static class Hexagon implements AreaInterface {
        private double R;
        Hexagon(double R) {
            this.R = R;
        }

        @Override
        public double area() {
            return 2.598 * this.R;
        }
    }

    private static void privateCall(Object o) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
       tryReflection(o);
    }

    protected static void tryReflection(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = o.getClass().getMethod("area", null);
        Object result = method.invoke(o, null);

        System.out.println(result);
    }

}
