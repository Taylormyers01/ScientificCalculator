package com.zipcodewilmington.scientificcalculator;

public class ScientificMath {



    static double  baseNum;
    static String mode;
    static double savedAnswer;

    public ScientificMath(){
        baseNum = 0.00;
        mode = "degrees";
        savedAnswer = 0.00;
    }
    public void sine(){
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
            baseNum = Math.asin(convertToRadian(baseNum));
        }
        else{
            baseNum = Math.asin(baseNum);
        }
    }

    public static void inverseCosine(){
        if(mode.equals("degrees")){
            baseNum = Math.acos(convertToRadian(baseNum));
        }
        else{
            baseNum = Math.acos(baseNum);
        }
    }

    public static void inverseTan(){
        if(mode.equals("degrees")){
            baseNum = Math.atan(convertToRadian(baseNum));
        }
        else{
            baseNum = Math.atan(baseNum);
        }
    }

    public static void log(){
         baseNum = Math.log(baseNum);
    }

    public static void inverseLog(){
         baseNum = Math.log10(baseNum);
    }

    public static void naturalLog(){
        baseNum = Math.log1p(baseNum);
    }

    public static void inverseNaturalLog(){
        //inverse natural log is just the input number right?
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

    public static void printAnswer(){
        System.out.printf("Your answer is %.2f.", baseNum);

    }

    public static void setSavedAnswer(){
        savedAnswer = baseNum;
    }
    public static void clearSavedAnswer(){
        savedAnswer = 0;
    }

}
