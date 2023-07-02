package com.zipcodewilmington.scientificcalculator;

public class ScientificMath {



    static double  baseNum;
    static String mode;

    public ScientificMath(){
        baseNum = 0.00;
        mode = "degrees";
    }
    public static double sine(){
        double output;
        if(mode.equals("degrees")){
            output = Math.sin(convertToRadian(baseNum));
        }
        else{
            output = Math.sin(baseNum);
        }
        return output;
    }

    public static double cosine(){
        double output;
        if(mode.equals("degrees")){
            output = Math.cos(convertToRadian(baseNum));
        }
        else {
            output = Math.cos(baseNum);
        }
        return output;
    }

    public static double tan(){
        double output;
        if(mode.equals("degrees")){
            output = Math.tan(convertToRadian(baseNum));
        }
        else{
            output = Math.tan(baseNum);
        }
        return output;
    }
    public static double inverseSine(){
        double output;
        if(mode.equals("degrees")){
            output = Math.asin(convertToRadian(baseNum));
        }
        else{
            output = Math.asin(baseNum);
        }
        return output;
    }

    public static double inverseCosine(){
        double output;
        if(mode.equals("degrees")){
            output = Math.acos(convertToRadian(baseNum));
        }
        else{
            output = Math.acos(baseNum);
        }
        return output;
    }

    public static double inverseTan(){
        double output;
        if(mode.equals("degrees")){
            output = Math.atan(convertToRadian(baseNum));
            return output;
        }
        else{
            output = Math.atan(baseNum);
        }
        return output;
    }

    public static double log(double x){
        double output = Math.log(x);
        return output;
    }

    public static double inverseLog(double x){
        double output = Math.log10(x);
        return output;
    }

    public static double naturalLog(double x){
        double output = Math.log1p(x);
        return output;
    }

    public static double inverseNaturalLog(double x){
        return x;
    }

    public static double factorial(double x){
        double output = 1;
        while(x > 0){
            output = output * x;
            x--;
        }
        return output;
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

}
