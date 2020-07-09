package com.lily.top.interview.test;

import com.lily.top.interview.easy.ReverseLeftWords;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLeftWordsTest {

    @Test
    public void reverseLeftWords() {
        Assert.assertEquals("tlis", ReverseLeftWords.reverseLeftWords("list", 3));
    }

    @Test
    public void reverseLeftWords1() {
        assertEquals("tlis", ReverseLeftWords.reverseLeftWords1("list", 3));
    }
}