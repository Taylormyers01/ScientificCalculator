package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class ScientificMath {



    static double  baseNum;
    static String mode;
    static double savedAnswer;
    static String displayMode;

    public ScientificMath(){
        baseNum = 0.00;
        mode = "degrees";
        savedAnswer = 0.00;
        displayMode = "decimal";
    }
    public static void sine(){
        if(mode.equals("degrees")){
            baseNum = Math.sin(convertToRadian(baseNum));
        }
        else{
            baseNum = Math.sin(baseNum);
        }
    }

    public static void cosine(){
        if(mode.equals("degrees")){
            baseNum = Math.cos(convertToRadian(baseNum));
        }
        else {
            baseNum = Math.cos(baseNum);
        }
    }

    public static void tan(){
        if(mode.equals("degrees")){
            baseNum = Math.tan(convertToRadian(baseNum));
        }
        else{
            baseNum = Math.tan(baseNum);
        }
    }
    public static void inverseSine(){

        if(mode.equals("degrees")){
            baseNum = Math.asin(baseNum);
            baseNum = Math.toDegrees(baseNum);
        }
        else{
            baseNum = Math.asin(baseNum);
        }
    }

    public static void inverseCosine(){
        if(mode.equals("degrees")){
            baseNum = Math.acos(baseNum);
            baseNum = Math.toDegrees(baseNum);
        }
        else{
            baseNum = Math.acos(baseNum);
        }
    }

    public static void inverseTan(){
        if(mode.equals("degrees")){
            baseNum = Math.atan(baseNum);
            baseNum = Math.toDegrees(baseNum);
        }
        else{
            baseNum = Math.atan(baseNum);
        }
    }

    public static void log() { baseNum = Math.log10(baseNum);}

    public static void inverseLog(){
         //baseNum = Math.exp(Math.log(baseNum));
        baseNum = Math.pow(10.0, baseNum);
    }

    public static void naturalLog(){
        baseNum = Math.log(baseNum);
    }

    public static void inverseNaturalLog(){
        //inverse natural log is just the input number right?
        baseNum = Math.exp(baseNum);
    }

    public static void factorial(){
        double output = 1;
        while(baseNum > 0){
            output = output * baseNum;
            baseNum--;
        }
        baseNum = output;
    }

    public static void switchUnitModes(){
        if(mode.equals("degrees")){
            baseNum = convertToRadian(baseNum);
            mode = "radians";
            System.out.printf("You are now working with %.2f in %s \n",baseNum, mode);
            return;
        } else if (mode.equals("radians")) {
            baseNum = (baseNum * 180) / Math.PI;
            mode = "degrees";
            System.out.printf("You are now working with %.2f in %s \n",baseNum, mode);
        }
    }

    public static void switchUnitModes(String s){
        if(s.equalsIgnoreCase("degrees")&& mode.equals("radians")){
            baseNum = (baseNum * 180) / Math.PI;
            mode = "degrees";
            System.out.printf("You are now working with %.2f in %s \n",baseNum, mode);
        }
        else if (s.equalsIgnoreCase("radians") && mode.equals("degrees")){
            baseNum = convertToRadian(baseNum);
            mode = "radians";
            System.out.printf("You are now working with %.4f in %s \n",baseNum, mode);
        }
        else{
            System.out.printf("You are now working with %.2f in %s \n",baseNum, mode);
        }
    }

    public static void setBaseNum(double x){
        baseNum = x;
    }
    public static double convertToRadian(double x){
        double output =x * (Math.PI / 180);
        return output;
    }

   public static double getBaseNum(){
        return baseNum;
   }

    public static void printAnswer(){
        String conversion = "";

        if (displayMode.equalsIgnoreCase("decimal")){
            System.out.printf("Your answer is %.2f.", baseNum);
        }
        else if(displayMode.equalsIgnoreCase("binary")){
            conversion = Integer.toBinaryString((int)baseNum);
            System.out.printf("Your number in decimal is: %.2f and %s in binary\n", baseNum, conversion);
        }
        else if(displayMode.equalsIgnoreCase("octal")){
            conversion = Integer.toOctalString((int)baseNum);
            System.out.printf("Your number in decimal is: %.2f and %s in octal\n", baseNum, conversion);
        }
        else{
            conversion = Integer.toHexString((int)baseNum);
            System.out.printf("Your number in decimal is: %.2f and %s in hexadecimal\n", baseNum, conversion);
        }
    }

    public static void setSavedAnswer(){
        savedAnswer = baseNum;
    }
    public static void clearSavedAnswer(){
        savedAnswer = 0;
    }
    public static double getSavedAnswer(){
        return savedAnswer;
    }

    public static void switchDisplayMode(){
        if(displayMode.equalsIgnoreCase("binary")){
            displayMode = "octal";
            System.out.printf("Your answers will now display in %s \n", displayMode);
        }
        else if(displayMode.equalsIgnoreCase("octal")){
            displayMode = "decimal";
            System.out.printf("Your answers will now display in %s \n", displayMode);
        }
        else if(displayMode.equalsIgnoreCase("decimal")){
            displayMode = "hex";
            System.out.printf("Your answers will now display in %s \n", displayMode);
        }
        else{
            displayMode = "binary";
            System.out.printf("Your answers will now display in %s \n", displayMode);
        }
    }
    public static void switchDisplayMode(String input){
        String[] values = {"hex", "octal", "decimal","binary", "Hex", "Octal", "Decimal", "Binary"};
        boolean contains = Arrays.stream(values).anyMatch(s->s.contains(input));
        if(contains){
            displayMode = input;
            System.out.printf("Your answers will now display in %s \n", displayMode);
        }
        else{
            System.out.println("Please input a valid display mode");
        }
    }
}
