package nl.wvdzwan.tudelft.benchmark.cha.implement_multiple_interface;

public interface Interface2 {

    default String sayHello() {
        return "Hello";
    }
}
