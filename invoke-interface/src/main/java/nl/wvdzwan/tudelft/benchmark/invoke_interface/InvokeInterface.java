package nl.wvdzwan.tudelft.benchmark.invoke_interface;

public class InvokeInterface {

    public static void main(String[] args) {
        System.out.println(invokeInterface());
    }

    private static String invokeInterface() {
        ExampleInterface ex = new ExampleImpl();

        return ex.call();
    }
}
