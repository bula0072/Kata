package com.kata.PowerOfTwo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void powerOfTwo() {
        assertTrue(PowerOfTwo.powerOfTwo(2));
        assertTrue(PowerOfTwo.powerOfTwo(4));
        assertTrue(PowerOfTwo.powerOfTwo(8));
        assertTrue(PowerOfTwo.powerOfTwo(1024));

        assertFalse(PowerOfTwo.powerOfTwo(3));
        assertFalse(PowerOfTwo.powerOfTwo(6));
        assertFalse(PowerOfTwo.powerOfTwo(9));
        assertFalse(PowerOfTwo.powerOfTwo(2040));

    }
}