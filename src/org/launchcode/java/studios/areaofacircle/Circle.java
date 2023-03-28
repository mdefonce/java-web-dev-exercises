package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius) {
        if (radius < 0)
            System.err.println("Void");
//        else if (radius = "")
//            System.err.println("Void");
        return 3.14 * radius * radius;
    }
}
