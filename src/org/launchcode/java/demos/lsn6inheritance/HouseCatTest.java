package org.launchcode.java.demos.lsn6inheritance;

import junit.framework.TestCase;

public class HouseCatTest extends TestCase {
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}