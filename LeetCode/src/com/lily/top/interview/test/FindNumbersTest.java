package com.lily.top.interview.test;

import com.lily.top.interview.easy.FindNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumbersTest {

    @Test
    public void findNumbers() {
        int[] nums= {12,345,2,6,7896};
        assertEquals(2, new FindNumbers().findNumbers(nums));
    }
}