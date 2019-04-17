package nl.wvdzwan.tudelft.benchmark.cha.implement_multiple_interface;

public class Child implements Interface1, Interface2  {
    @Override
    public String sayHello() {
        return "Hello implementation";
    }
}
