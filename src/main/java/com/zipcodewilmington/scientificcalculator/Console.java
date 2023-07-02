package com.zipcodewilmington.scientificcalculator;

import org.w3c.dom.ls.LSOutput;

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


    public static void startUp() throws InterruptedException {

        boolean exit = false;
        while (exit != true) {

            System.out.println( "\n Welcome to Mellifera's Calculator ");
            System.out.println( " __________________________________ \n" +
                                "|                                  |\n" +
                                "| Would you like to use Basic Math?|\n" +
                                "| Or Scientific Math?              |\n" +
                                "| Input B for Basic Math           |\n" +
                                "| Input S for Scientific Math      |\n" +
                                "| Input E to Exit the calculator   |\n" +
                                "| _________________________________|\n");
            Scanner input = new Scanner(System.in);
            Character choice = input.next().charAt(0);
            choice = choice.toUpperCase(choice);
            if (choice == 'B') {
                System.out.println("You have chosen Basic Math");

                runBasicMath();

            } else if (choice == 'S') {
                System.out.println("You have chosen Scientific Math");

                runScientificMath();

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

        System.out.println( "_________________\n"+
                            "                 \n");
        System.out.printf(  "Your answer is: %d ", answer);
        System.out.println( "                 \n"+
                            "_________________");

        System.out.println("Input any key to continue");
        Scanner input = new Scanner(System.in);
        Character choice = input.next().charAt(0);
        choice = choice.toUpperCase(choice);


        }




    public static void runBasicMath() throws InterruptedException {

        boolean exit = false;
        while (exit != true) {

            System.out.println( " ________________________ \n"+
                                "|  [Input an operation]  |\n"+
                                "|                        |\n"+
                                "| + Addition             |\n"+
                                "| - Subtraction          |\n"+
                                "| * Multiplication       |\n"+
                                "| / Division             |\n"+
                                "| ^ Square a number      |\n"+
                                "| v Square Root a number |\n"+
                                "| ~ Variable Exponent    |\n"+
                                "| _ Inverse a number     |\n"+
                                "| | Invert a number      |\n"+
                                "|                        |\n"+
                                "|  [Or input e to exit]  |\n"+
                                " ------------------------   ");

            Scanner input = new Scanner(System.in);
            Character choice = input.next().charAt(0);


                if (choice == '+') {
                    System.out.println("Input your first number");
                    setBaseNum(input.nextInt());

                    System.out.println("Input your second number");
                    setOperatorNum(input.nextInt());

                    setAnswer(BasicMath.addNum(baseNum, operatorNum));



                   // System.out.println(BasicMath.addNum(baseNum, operatorNum));

                } else if (choice == '-') {
                    System.out.println("Input your first number");
                    setBaseNum(input.nextInt());

                    System.out.println("Input your second number");
                    setOperatorNum(input.nextInt());

                    setAnswer(BasicMath.subNum(baseNum, operatorNum));

                } else if (choice == '*') {
                    System.out.println("Input your first number");
                    setBaseNum(input.nextInt());

                    System.out.println("Input your second number");
                    setOperatorNum(input.nextInt());

                    setAnswer(BasicMath.multNum(baseNum, operatorNum));

                } else if (choice == '/') {
                    System.out.println("Input your first number");
                    setBaseNum(input.nextInt());

                    System.out.println("Input your second number");
                    int temp = input.nextInt();

                    if (temp == 0) {

                        boolean ePressed = false;

                            System.out.println("ERROR");
                            System.out.println("PRESS E TO EXIT");

                            String reset = input.nextLine();
                            while (!reset.equalsIgnoreCase("e") ) {
                                reset = input.nextLine();
                            }

                    } else if (temp != 0) {
                        setOperatorNum(temp);
                        setAnswer((int) BasicMath.divNum(baseNum, operatorNum));
                    }


                } else if (choice == '^') {
                    System.out.println("Input your number");
                    setBaseNum(input.nextInt());

                    setAnswer(BasicMath.sqrNum(baseNum));

                } else if (choice == 'v') {
                    System.out.println("Input your number");
                    setBaseNum(input.nextInt());

                    setAnswer((int) BasicMath.sqrRootNum(baseNum));

                } else if (choice == '~') {
                    System.out.println("Input your first number");
                    setBaseNum(input.nextInt());

                    System.out.println("Input your second number");
                    setOperatorNum(input.nextInt());

                    setAnswer((int) BasicMath.expNum(baseNum, operatorNum));

                } else if (choice == '_') {
                    System.out.println("Input your number");
                    setBaseNum(input.nextInt());

                    setAnswer((int) BasicMath.inverseNum(baseNum));

                } else if (choice == '|') {
                    System.out.println("Input your number");
                    setBaseNum(input.nextInt());

                    setAnswer(BasicMath.invertNum(baseNum));

                }
                    else if (choice == 'e') {
                    exit = true;

                }
            }
        }

    public static void runScientificMath() {

        ScientificMath sm = new ScientificMath();

        boolean exit = false;
        while (exit != true) {

            System.out.println(" ________________________ \n" +
                                "|  [Input an operation]  |\n" +
                                "|                        |\n" +
                                "|   sin                  |\n" +
                                "|   cos                  |\n" +
                                "|   tan                  |\n" +
                                "|   asin                 |\n" +
                                "|   acos                 |\n" +
                                "|   atan                 |\n" +
                                "|   log                  |\n" +
                                "|   ilog                 |\n" +
                                "|   nlog                 |\n" +
                                "|   inlog                |\n" +
                                "|   !                    |\n" +
                                "|   switch unit          |\n" +
                                "|   switch display       |\n" +
                                "|                        |\n" +
                                "|                        |\n" +
                                "|  [Or input e to exit]  |\n" +
                                " ------------------------");

            Scanner input = new Scanner(System.in);
            String choice = input.next();
            if (choice.equalsIgnoreCase("e")) {
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
