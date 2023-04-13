package exercises.tests;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

    Laptop myLaptop;
    @Before
    public void beforeTests() {
        myLaptop = new Laptop(1590, 1920, "Apple", true);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(1590, this.myLaptop.getScreenHeight());
        assertEquals(1920, this.myLaptop.getScreenWidth());
        assertEquals("Apple", this.myLaptop.getManufacturer());
        assertEquals(true, this.myLaptop.getIntelliJOpened());
    }

    @Test
    public void twoPlusTwoTest() {
        int result = this.myLaptop.processTwoPlusTwo();
        assertEquals(4, result);
    }

    @Test
    public void openIntelliJ() {
        this.myLaptop.setIntelliJOpened(false);
        assertEquals(false, this.myLaptop.getIntelliJOpened());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.getIntelliJOpened());
    }

}
