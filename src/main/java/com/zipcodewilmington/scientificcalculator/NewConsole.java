package com.zipcodewilmington.scientificcalculator;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NewConsole {



    static double answer;
    static double baseNum;
    static double operatorNum;
    static String[] previousOperations = {"1 + 1", "1 + 2", "log(22)"};
    static String[] previousAnswers = {"55.2","55.2","55.2"};
    private static String[][] operators ={ {"+", "-", "*", "/", "^", "v", "~", "_", "|", "%",
                                        " sin ", " cos ", " tan ", " asin", " acos", " atan", " log ",
                                        " ilog", " nlog", "inlog", "!", "  SU ", "  SD ", " Save", " View", "Clear"},
                                        {"Addition", "Subtraction", "Multiplication", "Division", "Square a number",
                                        "Square root", "Exponent", "Inverse number", "Invert Number", "Get % of num",
                                        "Sine", "Cosine", "Tangent", "Arcsine", "Arccosine", "ArcTangent", "Log",
                                        "Inverse Log", "Natural Log", "Inverse Natural Log", "Factorial", "Switch Units",
                                        "Switch Display", "Save Current Answer", "View Saved Answer", "Clear Saved Answer"}}; // len 26

    private static Scanner input = new Scanner(System.in);

    public NewConsole() {

        baseNum = 0.0;
        operatorNum = 0.0;
        answer = 0.0;

    }

    public static void startUp() throws InterruptedException, IOException {
        boolean exit = false;
        while (exit != true) {

            System.out.println( "\n Welcome to Mellifera's Calculator ");
            System.out.println( " __________________________________ \n" +
                    "|                                  |\n" +
                    "| Would you like to use Basic Math?|\n" +
                    "| Or Scientific Math?              |\n" +
                    "| Input B for Basic Math           |\n" +
                    "| Input S for Scientific Math      |\n" +
                    "| Input D for Dancing Man          |\n" +
                    "|                                  |\n" +
                    "| Input E to Exit the calculator   |\n" +
                    "| _________________________________|\n");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            switch(choice.toLowerCase()){
                case "b":
                    //runBasicMath();
                    for(int i = 0; i < 4; i++) {
                        System.out.println(displayCalc(12.0));
                        System.out.println(captureInput());
                        //Runtime.getRuntime().exec("clear");

                    }
                    break;
                case "s":
                    //runScientificMath();
                    break;
                case "d":
                    //dancingMan();
                    break;
                case "h":
                    System.out.println(helpMenu());
                    break;
                case "e":
                    System.out.println("Thank you for using our Calculator");
                    exit = true;
                    break;
            }
        }
    }
    private static String captureInput(){
        return input.nextLine();
    }

    private static String helpMenu(){

        StringBuilder sb = new StringBuilder();
        System.out.println(operators[0].length);
        for (int i = 0; i < operators[0].length; i++){
            sb.append(String.format("%5s : %-20s", operators[0][i], operators[1][i]));
            if(i%2 ==0){
                sb.append("\n");
            }
        }

        return sb.toString();
    }



    public static String displayCalc(Double currentValue){
        StringBuilder sb = new StringBuilder();
        sb.append(screen());
//        for(int i = 0; i < 4;i++){
//            sb.append(sides());
//        }
        sb.append(buttons());
        return sb.toString();
    }

    private static StringBuilder screen(){
        StringBuilder sb = new StringBuilder();
        sb.append(topBorder());
        for(int i = 0; i < previousOperations.length; i++){
            sb.append(String.format("|  %-16s=%15s|\n", previousOperations[i], previousAnswers[i]));
        }
        sb.append(bottomBorder());
        return sb;
    }

    private static StringBuilder buttons(){
        StringBuilder sb = new StringBuilder();
        String space = " ";
        sb.append(sides());
        for(int i = 0; i < operators[0].length - 4; i +=4){
            sb.append("|");
            for(int j = i; j < i + 4; j++) {
                int spaces = (5 / operators[0][j].length() ) / 2;
                sb.append(" [");
                for (int x = 0; x < spaces; x++) {
                    sb.append(space);
                }
                sb.append(operators[0][j]);
                for (int y = 0; y < spaces; y++) {
                    sb.append(space);
                }
                sb.append("]");


            }

            sb.append(("  |\n"));
        }
        sb.append(String.format("| [%5s] [%5s] [%5s] [%5s]  |\n", space, "Help", operators[0][24], operators[0][25]));
        sb.append(bottomBorder());
        return sb;
    }
    private static StringBuilder topBorder(){
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        for(int i = 0; i<34; i++){
            sb.append("_");
        }
        sb.append("\n");
        return sb;
    }
    private static StringBuilder bottomBorder(){
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for(int i = 0; i<34; i++){
            sb.append("_");
        }
        sb.append("|\n");
        return sb;
    }
    private static StringBuilder sides(){
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for (int i = 0; i < 34; i++){
            sb.append(" ");
        }
        sb.append("|\n");
        return sb;
    }
}
