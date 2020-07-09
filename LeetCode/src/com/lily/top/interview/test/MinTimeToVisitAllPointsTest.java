package com.lily.top.interview.test;

import com.lily.top.interview.easy.MinTimeToVisitAllPoints;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTimeToVisitAllPointsTest {

    @Test
    public void minTimeToVisitAllPoints() {
        int[][] point = {{1,1},{3,4},{-1,0}};
        int ans = 7;
        assertEquals(ans, new MinTimeToVisitAllPoints().minTimeToVisitAllPoints(point));
    }
}