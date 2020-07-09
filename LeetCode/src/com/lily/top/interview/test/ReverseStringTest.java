package com.lily.top.interview.test;

import com.lily.top.interview.easy.ReverseString;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        char[] s = {'h','e','l','l','o'};
        char[] ans = {'o','l','l','e','h'};
        assertArrayEquals(ans, new ReverseString().reverseString(s));
    }
}