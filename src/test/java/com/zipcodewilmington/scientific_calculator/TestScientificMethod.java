package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificMath;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class TestScientificMethod {

    @Test
   public void sineTest() {

        // Test sin
        double baseNum = 16.0;
        double expected = 0.275; // Degrees answer

        double actual = ScientificMath.sine(baseNum);
        Assert.assertEquals(expected, actual, 0.002);
    }
    @Test
    public void cosineTest() {
        // Test cos
        double baseNum = 16;
        double expected = 0.961; // Degrees answer

        double actual = ScientificMath.cosine(baseNum);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void tanTest() {
        // Test tan
        double baseNum = 16.0;
        double expected = 0.287; // Degrees answer

        double actual = ScientificMath.tan(baseNum);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void inverseSine(){
        // Test inverse sin
        double baseNum = 1;
        double expected = 90; // Degrees answer
        //double expected2 = 1.57 // Rad answer

        double actual = ScientificMath.inverseSine(baseNum);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void inverseCosine() {
        // Test inverse cos
        double baseNum = 0.5;
        double expected = 60; // Degrees answer
        //double expected2 = 1.047 // Rad answer

        double actual = ScientificMath.inverseCosine(baseNum);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void inverseTan() {
        // Test inverse tan
        double baseNum = 16;
        double expected = 86.424; // Degrees answer
        //double expected2 = 1.508 // Rad answer

        double actual = ScientificMath.inverseTan(baseNum);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void log() {
        // Test log
        double x = 16;
        double expected = 1.204;

        double actual = ScientificMath.log(x);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void inverseLog() {
        // Test inverse log
        double x = 2;
        double expected = 100;

        double actual = ScientificMath.inverseLog(x);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void naturalLog() {
        // Test natural log
        double x = 2;
        double expected = 4.605;

        double actual = ScientificMath.naturalLog(x);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void inverseNaturalLog() {
        // Test inverse natural log
        double x = 2;
        double expected = 100;

        double actual = ScientificMath.naturalLog(x);
        Assert.assertEquals(expected, actual, 0.002);
    }

    @Test
    public void factorial(){
        // Test factorial
        double x = 2.0;
        double expected = 2.0;

        double actual = ScientificMath.factorial(x);
        Assert.assertEquals(expected, actual, 0.002);

    }


}
