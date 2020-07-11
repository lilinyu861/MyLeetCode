package com.lily.top.interview.easy;

import com.lily.leetcode.easy_array.CreateTargetArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateTargetArrayTest {

    @Test
    public void testCreateTargetArray(){
        int[] nums1 = {0,1,2,3,4};
        int[] index1 = {0,1,2,2,1};
        int[] res = {0,4,1,3,2};
        assertArrayEquals(res, new CreateTargetArray().createTargetArray(nums1, index1));
    }

}