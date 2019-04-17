/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.invoke_interface;

public class ExampleImpl implements ExampleInterface {


    @Override
    public String call() {
        return "ExampleImpl->call()";
    }
}
