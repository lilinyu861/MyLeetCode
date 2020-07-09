package com.lily.top.interview.test;

import com.lily.top.interview.easy.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testGame(){
        int[] guess = {1,2,3};
        int[] answer = {1,2,3};
        assertEquals(3, new Game().game(guess, answer));
    }

    @Test
    public void testGame1(){
        int[] guess = {1,2,1};
        int[] answer = {1,2,3};
        assertEquals(2, new Game().game(guess, answer));
    }
}