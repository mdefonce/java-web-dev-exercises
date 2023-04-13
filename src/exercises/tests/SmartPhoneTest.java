package exercises.tests;

import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone mySmartphone;
    @Before
    public void beforeTests() {
        mySmartphone = new SmartPhone(900, 380, "Samsung", false);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(900, this.mySmartphone.getScreenHeight());
        assertEquals(380, this.mySmartphone.getScreenWidth());
        assertEquals("Samsung", this.mySmartphone.getManufacturer());
        assertEquals(false, this.mySmartphone.getIsConnectedTo5G());
    }

    @Test
    public void twoPlusTwoTest() {
        int result = this.mySmartphone.processTwoPlusTwo();
        assertEquals(4, result);
    }


}
