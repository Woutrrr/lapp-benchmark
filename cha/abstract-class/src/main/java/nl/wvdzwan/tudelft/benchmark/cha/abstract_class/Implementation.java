/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.cha.abstract_class;

public class Implementation extends AbstractClass {

    @Override
    public String publicSayHello() {
        return "Public Hello";
    }

    @Override
    protected String protectedSayHello() {
        return "Protected Hello";
    }

    @Override
    String sayHello() {
        return "Hello";
    }
}
