/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.extension_a;

import nl.wvdzwan.tudelft.benchmark.core.Farm.Mammal;

public class TMN extends Mammal {

    public void move(int distance) {
        // Separate println to prevent inclusion of StringBuilder in call graph
        System.out.println("Move for");
        System.out.println(distance);
        System.out.println("steps.");
    }

    public void feed() {

    }

    @Override
    public void sleep(int time) {
        System.out.println("sleep");
    }
}
