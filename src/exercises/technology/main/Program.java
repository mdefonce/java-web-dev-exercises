package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(900, 380, "Samsung", false);
        mySmartPhone.makePhoneCall("314-324-6619");
        int result = mySmartPhone.processTwoPlusTwo();
        System.out.println("The result is: " + result);
        System.out.println(mySmartPhone.getId());

        Laptop myLaptop = new Laptop(1590, 1920, "Apple");
        myLaptop.openIntelliJ();
        int laptopResult = myLaptop.processTwoPlusTwo();
        System.out.println("The result is: " + laptopResult);
        System.out.println(myLaptop.getId());

        Computer myComputer = new Computer(1590, 1920, "Apple");
        int computerResult = myComputer.processTwoPlusTwo();
        System.out.println("The result is: " + computerResult);
        System.out.println(myComputer.getId());
    }
}
