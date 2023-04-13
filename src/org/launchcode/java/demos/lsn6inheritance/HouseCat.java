package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
    }

    public HouseCat(double aWeight) {
        super(aWeight);
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

//    @Override
//    public String noise() {
//        return "Hello, my name is " + name + "!";
//    }

    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise(); // prints "Meeeeeeooooowww!"
        }
    }
//    @Test
//    public void inheritsSuperInFirstConstructor() {
//        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
//        assertEquals(7, keyboardCat.getWeight(), .001);
//    }
    public String purr() {
        return "I'm a HouseCat";
    }
}
