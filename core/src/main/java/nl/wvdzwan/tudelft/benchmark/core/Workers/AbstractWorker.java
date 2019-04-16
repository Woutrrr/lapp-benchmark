package nl.wvdzwan.tudelft.benchmark.core.Workers;

public abstract class AbstractWorker {

    private String name;

    public AbstractWorker(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int work();


}
