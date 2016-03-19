package com.dengsishun.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Velacielad on 2016/3/19.
 */
public class CalculateTest {
    private Calculate calculate;

    @Before
    public void setUp() throws Exception {
        calculate = new Calculate();
    }

    @Test
    public void testJudgment() throws Exception {
        assertEquals("error",calculate.judgment(1,2,3));
        assertEquals("equilateral",calculate.judgment(2,2,2));
        assertEquals("isosceles",calculate.judgment(2,2,3));
        assertEquals("scalene",calculate.judgment(4,2,3));
    }
}