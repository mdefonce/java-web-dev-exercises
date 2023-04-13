package exercises.technology.main;

public class Computer extends AbstractEntity {

    private int screenHeight;
    private int screenWidth;
    private String manufacturer;

    public Computer(int screenHeight, int screenWidth, String manufacturer) {
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.manufacturer = manufacturer;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int processTwoPlusTwo() {
        return 2+2;
    }

    public void tellMeAJoke() {
        System.out.println("Why did the computer show up at work late? It had no drive.");
    }
}
