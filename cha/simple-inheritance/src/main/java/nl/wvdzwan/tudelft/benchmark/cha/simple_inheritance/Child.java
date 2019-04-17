/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.cha.simple_inheritance;

public class Child extends Parent {

    @Override
    public String sayHello() {
        return "Good day!";
    }
}
