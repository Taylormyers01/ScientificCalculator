package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {



    @Test
    // Add the given numbers
    public void addTest(){
        int x = -34;
        int y = 18;
        int expected = -16;

        double actual = BasicMath.addNum(x,y);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .002);
    }


    @Test
    // Subtract given numbers
    public void subtractTest(){
        int x = 34;
        int y = 18;
        int expected = 16;

        double actual = BasicMath.subNum(x,y);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .002);
    }


    @Test
    // multiply given numbers
    public void multiplyTest(){
        int x = 34; //34.0
        int y = 18;
        int expected = 612; //612.0

        double actual = BasicMath.multNum(x,y);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .002);
    }


    @Test
    // divide given numbers
    public void divideTest(){
        double x = 3.4; //34.0
        double y = 18.0;
        double expected = 0.19; //1.89

        double actual = BasicMath.divNum(x,y);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .002);
    }


    @Test
    // Square given number
    public void squaredTest(){
        int x = 34;
        int expected = 1156;

        double actual = BasicMath.sqrNum(x);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .002);
    }


    @Test
    // Square root given number
    public void sqrRootTest(){
        double x = 50.0;
        double expected = 7.07;

        double actual = BasicMath.sqrRootNum(x);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .002);
    }


    @Test
    // Calculate variable exponentiation
    public void exponentTest(){
        int x = 3;
        int y = 5;
        int expected = 243;

        double actual = BasicMath.expNum(x,y);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .2);
    }


    @Test
    // Inverse the given number
    public void inverseTest(){
    double x = 8.0;
    double expected = 0.125;

    double actual = BasicMath.inverseNum(x);
    System.out.println(actual);
    Assert.assertEquals(expected, actual, .2);
    }


    @Test
    // Invert the given number
    public void invertTest(){
        int x = 34;
        int expected = -34;

        double actual = BasicMath.invertNum(x);
        System.out.println(actual);
        Assert.assertEquals(expected, actual, .2);
    }
}
