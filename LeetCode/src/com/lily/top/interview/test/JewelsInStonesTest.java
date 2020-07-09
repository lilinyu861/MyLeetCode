package com.lily.top.interview.test;

import com.lily.top.interview.easy.JewelsInStones;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsInStonesTest {

    @Test
    public void numJewelsInStones() {
        String J = "aA";
        String S = "aAAbbbb";
        assertEquals(3, new JewelsInStones().numJewelsInStones(J, S));
    }
}