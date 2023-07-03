package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificMath;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class TestScientificMethod {

    ScientificMath sm = new ScientificMath();

    @Test
    public void sineTest() {
        // Test sin
        sm.setBaseNum(16.0);
        double expected = 0.275; // Degrees answer
        sm.sine();

        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }
    @Test
    public void cosineTest() {
        // Test cos
        sm.setBaseNum(16.0);
        double expected = 0.961; // Degrees answer
        sm.cosine();

        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void tanTest() {
        // Test tan
        sm.setBaseNum(16.0);
        double expected = 0.287; // Degrees answer
        sm.tan();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void inverseSine(){
        // Test inverse sin
        sm.setBaseNum(1);
        double expected = 90; // Degrees answer
        sm.inverseSine();
        //double expected2 = 1.57 // Rad answer

        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void inverseCosine() {
        // Test inverse cos
        sm.setBaseNum(0.5);
        double expected = 60; // Degrees answer
        //double expected2 = 1.047 // Rad answer
        sm.inverseCosine();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void inverseTan() {
        // Test inverse tan
        sm.setBaseNum(16.0);
        double expected = 86.424;  //Degrees answer
        //double expected2 = 1.508; // Rad answer
        sm.inverseTan();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void log() {
        // Test log
        sm.setBaseNum(16.0);
        double expected = 1.204;
        sm.log();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void inverseLog() {
        // Test inverse log
        sm.setBaseNum(3);
        double expected = 1000;
        sm.inverseLog();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void naturalLog() {
        // Test natural log
        sm.setBaseNum(2);
        double expected = 0.693;
        sm.naturalLog();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void inverseNaturalLog() {
        // Test inverse natural log
        sm.setBaseNum(2);
        double expected = 7.389;
        sm.inverseNaturalLog();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);
    }

    @Test
    public void factorial(){
        // Test factorial
        sm.setBaseNum(2);
        double expected = 2.0;
        sm.factorial();
        Assert.assertEquals(expected, sm.getBaseNum(), 0.002);

    }


}