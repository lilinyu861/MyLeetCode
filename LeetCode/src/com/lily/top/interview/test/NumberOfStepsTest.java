package com.lily.top.interview.test;

import com.lily.top.interview.easy.NumberOfSteps;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStepsTest {

    @Test
    public void testNumberOfSteps(){
        assertEquals(6, NumberOfSteps.numberOfSteps(14));
        assertEquals(4, NumberOfSteps.numberOfSteps(8));
    }
}