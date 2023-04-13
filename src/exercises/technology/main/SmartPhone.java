package exercises.technology.main;

public class SmartPhone extends Computer {

    private boolean isConnectedTo5G;

    public boolean getIsConnectedTo5G() {
        return this.isConnectedTo5G;
    }

    public SmartPhone(int screenHeight, int screenWidth, String manufacturer, boolean isConnectedTo5G) {
        super(screenHeight, screenWidth, manufacturer);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    public void makePhoneCall(String number) {
        System.out.println("Calling: " + number);
    }

}
