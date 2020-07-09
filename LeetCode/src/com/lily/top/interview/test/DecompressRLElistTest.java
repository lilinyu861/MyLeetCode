package com.lily.top.interview.test;

import com.lily.top.interview.easy.DecompressRLElist;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DecompressRLElistTest {

    @Test
    public void decompressRLElist() {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,1,2,3};
        int[] ans1 = {2,4,4,4};
        int[] ans2 = {1,3,3};
        assertArrayEquals(ans1, new DecompressRLElist().decompressRLElist(nums1));
        assertArrayEquals(ans2, new DecompressRLElist().decompressRLElist(nums2));
    }
}