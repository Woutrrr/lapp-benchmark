/*
 * Copyright: (c) 2019, Wouter van der Zwan <lapp@wvdzwan.nl>
 * GNU General Public License v3.0+ (see COPYING or https://www.gnu.org/licenses/gpl-3.0.txt)
 */

package nl.wvdzwan.tudelft.benchmark.app.Farm;

import nl.wvdzwan.tudelft.benchmark.core.Farm.Animal;
import nl.wvdzwan.tudelft.benchmark.core.Farm.Dog;

public class AnimalFarm {


    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.move(2);

    }
}
