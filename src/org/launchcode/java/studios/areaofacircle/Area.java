package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }

//    public Area() {
//
//    }

    public void calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");

        try {
            boolean keepLooping = true;
            while(keepLooping) {
                double radius = input.nextDouble();

                if (radius < 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of the circle is: " + area);
                    keepLooping = false;
                }
            }
        } catch (Exception error) {
            System.out.println("You must provide a numeric input.");
        }

        input.close();
    }

}





//        Scanner input = new Scanner(System.in);
//        System.out.println("What is the radius of the circle?");
//        try {
//            double radius = input.nextDouble();
//
//            if (radius < 0) {
//                System.err.println("You cannot enter a negative number.");
//            } else {
//                double area = Circle.getArea(radius);
//            }
//
//
//            while(radius < 0) {
//                System.err.println("VOID");
//                radius = input.nextDouble();
//            }
//            while(input.contains("[a-zA-Z]+")) {
//                System.err.println("VOID");
//                radius = input.nextDouble();
//            }
//            System.out.println("The area of the circle is: " + Circle.getArea(radius));
////            if (input.contains("[a-zA-Z]+"))
////                System.err.println("Void");
////        else if (radius.isNumeric())
////        else if (radius.equals(""))
////            System.err.println("Void");
//        } catch(Exception e) {
//            System.out.print("VOID" + e);
//        }
////        double area = 3.14 * radius * radius;
////        double area = Circle.getArea(radius);
//
//    }
//}
