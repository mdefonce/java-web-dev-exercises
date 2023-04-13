package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13

        HouseCat taco = new HouseCat(25);
        System.out.println(taco.getWeight());   // prints 25

//        Cat salem = new Cat(8);

        Cat suki = new HouseCat("Suki", 8);


    }


}
