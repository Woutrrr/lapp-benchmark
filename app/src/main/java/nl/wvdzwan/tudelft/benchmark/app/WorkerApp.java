/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

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
