package com.lily.top.interview.test;

import com.lily.top.interview.easy.TwoSum;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        assertEquals(Arrays.toString(new int[]{0,1}), Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}