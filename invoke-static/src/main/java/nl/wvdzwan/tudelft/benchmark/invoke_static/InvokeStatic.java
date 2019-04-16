package nl.wvdzwan.tudelft.benchmark.invoke_static;

import nl.wvdzwan.tudelft.benchmark.dependencies.static_call.InvokeStaticDependency;

public class InvokeStatic {

    public static void main(String[] args) {

        System.out.println(invokeStatic());

        System.out.println(invokeNestedStatic());

        System.out.println(invokeStaticDep());

    }

    private static String invokeNestedStatic() {
        return InvokeStatic.nestInvokeStatic();
    }

    private static String invokeStatic() {
        return InvokeStatic.call();
    }

    private static String nestInvokeStatic() {
        return InvokeStatic.call();
    }

    public static String call() {
        return "InvokeStatic::call()";
    }

    private static String invokeStaticDep() {
        return InvokeStaticDependency.call();
    }

}
