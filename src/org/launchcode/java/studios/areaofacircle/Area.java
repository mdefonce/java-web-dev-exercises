package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = input.nextDouble();
//        double area = 3.14 * radius * radius;
        double area = Circle.getArea(radius);

        System.out.println("The area of the circle is: " + area);
    }
}
