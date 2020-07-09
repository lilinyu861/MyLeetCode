package com.lily.top.interview.test;

import com.lily.top.interview.hard.ReversePairs;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePairsTest {

    @Test
    public void reversePairs() {
        int[] nums = {7,5,6,4};
        assertEquals(5, new ReversePairs().reversePairs(nums));
        assertEquals(5, new ReversePairs().reversePairs1(nums));
    }
}