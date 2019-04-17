/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.extension_a;

import nl.wvdzwan.tudelft.benchmark.core.AreaInterface;

public class Triangle implements AreaInterface {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double area() {
        return sub_calculation();
    }

    private double sub_calculation() {
        return 0.5 * base * height;
    }
}