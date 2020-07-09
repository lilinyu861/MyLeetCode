package com.lily.top.interview.test;

import com.lily.top.interview.middle.NumIslands;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumIslandsTest {

    @Test
    public void numIsland(){
        char[][] test1 = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        assertEquals(1, new NumIslands().numIslands(test1));
    }
}