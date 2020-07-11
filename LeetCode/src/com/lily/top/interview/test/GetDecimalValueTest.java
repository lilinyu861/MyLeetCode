package com.lily.top.interview.test;

import com.lily.leetcode.easy_list.GetDecimalValue;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetDecimalValueTest {

    @Test
    public void testCase1(){
        GetDecimalValue.ListNode head = new GetDecimalValue.ListNode(1);
        head.next = new GetDecimalValue.ListNode(0);
        head.next.next = new GetDecimalValue.ListNode(1);
        int sum = 5;
        int ans = 0;
        for(int i = 0; i < 3; i++){
            ans = new GetDecimalValue().getDecimalValue(head);
        }
        assertEquals(sum, ans);
    }

}