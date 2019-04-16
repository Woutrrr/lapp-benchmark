package nl.wvdzwan.tudelft.benchmark.core.Workers;

public class HardWorker extends AbstractWorker {
    public HardWorker(String name) {
        super(name);
    }

    @Override
    public int work() {
        return 5;
    }
}
