/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.core;

class Square implements AreaInterface {

    private final double length;
    private final double width;

    public Square (double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double area() {
        return length * width;
    }
}