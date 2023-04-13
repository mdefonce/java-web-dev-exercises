package exercises.technology.main;

public class Laptop extends Computer{

    private boolean isIntelliJOpened;

    public Laptop(int screenHeight, int screenWidth, String manufacturer) {
        super(screenHeight, screenWidth, manufacturer);
        this.isIntelliJOpened = false;
    }

    public Laptop(int screenHeight, int screenWidth, String manufacturer, boolean isIntelliJOpened) {
        super(screenHeight, screenWidth, manufacturer);
        this.isIntelliJOpened = isIntelliJOpened;
    }

    public boolean getIntelliJOpened() {
        return isIntelliJOpened;
    }

    public void setIntelliJOpened(boolean isIntelliJOpened) {
        this.isIntelliJOpened = isIntelliJOpened;
    }

    public void openIntelliJ() {
        this.isIntelliJOpened = true;
        System.out.println("IntelliJ is now opened.");
    }

}
