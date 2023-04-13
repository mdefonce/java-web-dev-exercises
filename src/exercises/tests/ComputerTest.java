package exercises.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer myComputer;
    @Before
    public void beforeTests() {
        myComputer = new Computer(1590, 1920, "Apple");
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(1590, this.myComputer.getScreenHeight());
        assertEquals(1920, this.myComputer.getScreenWidth());
        assertEquals("Apple", this.myComputer.getManufacturer());
    }

    @Test
    public void twoPlusTwoTest() {
        int result = this.myComputer.processTwoPlusTwo();
        assertEquals(4, result);
    }

}
