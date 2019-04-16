package nl.wvdzwan.tudelft.benchmark.core.Workers;

public class LightWorker extends AbstractWorker {
    public LightWorker(String name) {
        super(name);
    }

    @Override
    public int work() {
        return 1;
    }
}
