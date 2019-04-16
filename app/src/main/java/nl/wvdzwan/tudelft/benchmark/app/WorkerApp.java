package nl.wvdzwan.tudelft.benchmark.app;

import nl.wvdzwan.tudelft.benchmark.core.Workers.AbstractWorker;
import nl.wvdzwan.tudelft.benchmark.core.Workers.HardWorker;

public class WorkerApp {


    public static void main(String[] args) {


        AbstractWorker worker = new HardWorker("John");

        int hoursWorked = worker.work();

        System.out.println(worker.getName() + " worked " + hoursWorked + " hours.");


    }
}
