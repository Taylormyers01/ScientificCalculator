package com.zipcodewilmington.scientificcalculator;

import java.io.IOException;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) throws InterruptedException, IOException {


        /*
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");
        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        */


        //Console c = new Console();
        NewConsole c = new NewConsole();
        try {
            c.startUp();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
