package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        /*
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");
        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        */


        Console c = new Console();
        ScientificMath sm = new ScientificMath();
        sm.setBaseNum(150);
        //2.617993878
        //System.out.println(sm.convertToRadian(150));
        sm.switchUnitModes("radians");

        /*
        System.out.println(sm.factorial(7));
        sm.setBaseNum(2.617993878);
        System.out.println(sm.sine());
        sm.switchUnitModes();
        System.out.println(sm.sine());
        c.startUp();
         */

    }
}
