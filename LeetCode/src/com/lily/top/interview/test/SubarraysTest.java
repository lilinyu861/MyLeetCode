package com.lily.top.interview.test;

import com.lily.top.interview.middle.Subarrays;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraysTest {

    @Test
    public void numberOfSubarrays() {
        int [] nums1 = {1,1,2,1,1};
        int [] nums2 = {2,4,6};
        int [] nums3 = {2,2,2,1,2,2,1,2,2,2};
        int [] nums4 = {0};
        int [] nums5 = {1};
        int k1 = 3;
        int k2 = 1;
        int k3 = 2;
        int k4 = 0;
        int k5 = 1;
        assertEquals(2, new Subarrays().numberOfSubarrays(nums1, k1));
        assertEquals(0, new Subarrays().numberOfSubarrays(nums2, k2));
        assertEquals(16, new Subarrays().numberOfSubarrays(nums3, k3));
        assertEquals(1, new Subarrays().numberOfSubarrays(nums4, k4));
        assertEquals(1, new Subarrays().numberOfSubarrays(nums5, k5));
    }
}