package com.lily.top.interview.test;

import com.lily.top.interview.middle.WaysToChange;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaysToChangeTest {

    @Test
    public void waysToChange() {
        assertEquals(73, new WaysToChange().waysToChange(61));
    }
}