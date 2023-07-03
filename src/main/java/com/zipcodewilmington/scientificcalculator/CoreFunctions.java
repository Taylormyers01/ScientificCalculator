package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
public class CoreFunctions {






    public static double add(double base, double modifier) {
        double ans = base + modifier;
        return ans;
    }

    public static double subtract(double base, double modifier) {
        double ans = base - modifier;
        return ans;
    }

    public static double divide(double base, double modifier) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        if (modifier >0) {
            ans = base / modifier;
        } else if (modifier == 0) {
            System.out.println("err");

        }
        return ans;
    }

    public static double multiply(double base, double modifier) {
        double ans = base * modifier;
        return ans;
    }

    public static double square(double base) {
        double ans = base * base;
        return ans;
    }

    public static double squareRoot(double base) {
        double ans = base / base;
        return ans;
    }

    public static double inverse(double a) {
        return 1;
    }







}