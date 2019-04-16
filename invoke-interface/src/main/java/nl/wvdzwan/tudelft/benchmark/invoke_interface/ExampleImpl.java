package nl.wvdzwan.tudelft.benchmark.invoke_interface;

public class ExampleImpl implements ExampleInterface {


    @Override
    public String call() {
        return "ExampleImpl->call()";
    }
}
