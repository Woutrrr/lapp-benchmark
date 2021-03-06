/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.invoke_interface;

public class InvokeInterface {

    public static void main(String[] args) {
        System.out.println(invokeInterface());
    }

    private static String invokeInterface() {
        ExampleInterface ex = new ExampleImpl();

        return ex.call();
    }
}
