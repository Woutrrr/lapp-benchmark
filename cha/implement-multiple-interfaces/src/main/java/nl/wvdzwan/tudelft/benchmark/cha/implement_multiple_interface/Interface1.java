package nl.wvdzwan.tudelft.benchmark.cha.implement_multiple_interface;

public interface Interface1 {
    default String sayHello() {
        return "Hello";
    }
}
