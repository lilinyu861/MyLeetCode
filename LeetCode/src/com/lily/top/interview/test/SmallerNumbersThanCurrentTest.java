package com.lily.top.interview.test;

import com.lily.top.interview.easy.SmallerNumbersThanCurrent;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallerNumbersThanCurrentTest {

    @Test
    public void smallerNumbersThanCurrent() {
        int[] nums = {8,1,2,2,3};
        int[] ans = {4,0,1,1,3};
        assertArrayEquals(ans, new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(nums));
        assertArrayEquals(ans, new SmallerNumbersThanCurrent().smallerNumbersThanCurrent1(nums));
    }
}