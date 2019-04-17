package nl.wvdzwan.tudelft.benchmark.cha.abstract_class;

public class Implementation extends AbstractClass {

    @Override
    public String publicSayHello() {
        return "Public Hello";
    }

    @Override
    protected String protectedSayHello() {
        return "Protected Hello";
    }

    @Override
    String sayHello() {
        return "Hello";
    }
}
