/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.invoke_virtual;

import nl.wvdzwan.tudelft.benchmark.dependencies.invoke_virtual.InvokeVirtualDependency;

public class InvokeVirtual {

    public static void main(String[] args) {

        System.out.println(invokeVirtual());

        System.out.println(invokeVirtualDep());

    }

    private static String invokeVirtual() {
        InvokeVirtual iv = new InvokeVirtual();

        return iv.call();
    }

    private static String invokeVirtualDep() {
        InvokeVirtualDependency ivd = new InvokeVirtualDependency();

        return ivd.call();
    }

    public  String call() {
        return "InvokeVirtual->call()";
    }

}
