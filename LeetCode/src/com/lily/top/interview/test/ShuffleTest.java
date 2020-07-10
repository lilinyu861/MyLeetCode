package com.lily.top.interview.test;

import com.lily.leetcode.easy_array.Shuffle;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleTest {

    @Test
    public void testShuffle(){
        int[] nums1 = {2,5,1,3,4,7};
        int n1 = 3;
        int[] nums2 = {1,2,3,4,4,3,2,1};
        int n2 = 4;
        int[] ans1 = {2,3,5,4,1,7};
        int[] ans2 = {1,4,2,3,3,2,4,1};
        assertArrayEquals(ans1, new Shuffle().shuffle(nums1, n1));
        assertArrayEquals(ans2, new Shuffle().shuffle(nums2, n2));
    }

}