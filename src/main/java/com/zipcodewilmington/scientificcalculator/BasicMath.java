package com.zipcodewilmington.scientificcalculator;

public class BasicMath {


    // addNum subNum multNum divNum
    // sqrNum sqrRootNum expNum inverseNum invertNum

    public static double addNum(double x, double y) {

        double ans = x + y;
        return ans;
    }

    public static double subNum(double x, double y) {

        double ans = x - y;
        return ans;
    }

    public static double multNum(double x, double y) {

        double ans = x * y;
        return ans;
    }

    public static double divNum(double x, double y) {

        double ans = x / y;
        return ans;
    }

    public static double sqrNum(double x) {

        double ans = x * x;
        return ans;
    }


    public static double sqrRootNum(double x) {

        double ans = Math.sqrt(x);
        return ans;
    }

    public static double expNum(double x, double y) {

        double ans = Math.pow(x, y);
        return ans;
    }

    public static double inverseNum(double x) {

        double ans = (1 / x);
        return ans;
    }

    public static double getPercentage(double x, double y) {
        //get x percent from y
        double ans = ((x/100) * y);
        return ans;

    }
    public static double invertNum(double x) {

        double ans = x * -1;
        return ans;
    }











}
