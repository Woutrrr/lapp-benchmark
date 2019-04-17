/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

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
