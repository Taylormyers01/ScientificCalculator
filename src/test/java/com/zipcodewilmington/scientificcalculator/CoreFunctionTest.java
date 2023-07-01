package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CoreFunctionTest {

    @Test
    public void addTest() {
        //given
        double a = 5;
        double b = 4;
        double expected = 9;

        //when
        double actual = CoreFunctions.add(a, b);

        //then

        Assert.assertEquals(expected, actual, .002);

    }

}
