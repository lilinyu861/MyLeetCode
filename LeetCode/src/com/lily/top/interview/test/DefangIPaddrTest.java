package com.lily.top.interview.test;

import com.lily.top.interview.easy.DefangIPaddr;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefangIPaddrTest {

    @Test
    public void defangIPaddr() {
        String str = "1.1.1.1";
        String ans = "1[.]1[.]1[.]1";
        assertEquals(ans, new DefangIPaddr().defangIPaddr(str));
        assertEquals(ans, new DefangIPaddr().defangIPaddr1(str));
    }
}