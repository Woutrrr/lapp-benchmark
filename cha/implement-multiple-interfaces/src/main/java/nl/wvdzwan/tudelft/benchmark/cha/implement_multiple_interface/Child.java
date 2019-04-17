/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.cha.implement_multiple_interface;

public class Child implements Interface1, Interface2  {
    @Override
    public String sayHello() {
        return "Hello implementation";
    }
}
