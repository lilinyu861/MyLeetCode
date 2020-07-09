package com.lily.top.interview.test;

import com.lily.top.interview.easy.ProductAndSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductAndSumTest {

    @Test
    public void subtractProductAndSum() {
        assertEquals(15, new ProductAndSum().subtractProductAndSum(234));
        assertEquals(21, new ProductAndSum().subtractProductAndSum(4421));
    }
}