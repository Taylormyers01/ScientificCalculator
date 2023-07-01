package com.zipcodewilmington.scientificcalculator;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

        static int baseNum;
        static int operatorNum;
        static int answer;



    public Console() {

        baseNum = 0;
        operatorNum = 0;
        answer = 0;



    }


    public static void startUp() {

        boolean exit = false;
        while (exit != true) {

            System.out.println("Would you like to use Basic Math or Scientific Math? \n" +
                               "Input B for Basic Math\n" +
                                "Input S for Scientific Math\n" +
                                "Input E to Exit the calculator");
            Scanner input = new Scanner(System.in);
            Character choice = input.next().charAt(0);
            choice = choice.toUpperCase(choice);
            if (choice == 'B') {
                System.out.println("You have chosen Basic Math");

                runBasicMath();

            } else if (choice == 'S') {
                System.out.println("You have chosen Scientific Math");
            } else if (choice == 'E') {
                System.out.println("Thank you for using our Calculator");
                exit = true;
            } else {
                System.out.println("Invalid input, please try again");
            }
        }
    }


    public static void setBaseNum(int x) {
        baseNum = x;
    }

    public static void setOperatorNum(int x) {
        operatorNum = x;
    }

    public static void setAnswer(int x) {
        answer = x;
        System.out.println("Your answer is: " + answer);
    }



    public static void runBasicMath() {

        boolean exit = false;
        while (exit != true) {

            System.out.println("Input + to add two numbers\n"+
                                "Or input e to exit");

            Scanner input = new Scanner(System.in);
            Character choice = input.next().charAt(0);
                if (choice == '+') {
                    System.out.println("Input your first number");
                    setBaseNum(input.nextInt());

                    System.out.println("Input your second number");
                    setOperatorNum(input.nextInt());

                    setAnswer(BasicMath.addNum(baseNum, operatorNum));

                   // System.out.println(BasicMath.addNum(baseNum, operatorNum));

                } else if (choice == 'e') {
                    exit = true;

                }
            }
        }






    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }
}
