/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.app;

import nl.wvdzwan.tudelft.benchmark.core.AreaInterface;

public class Printer implements ShapeOutput {

    @Override
    public void output(AreaInterface shape) {

        System.out.println(shape.area());
    }

    @Override
    public String toString() {
        return "Hoi";
    }

}
