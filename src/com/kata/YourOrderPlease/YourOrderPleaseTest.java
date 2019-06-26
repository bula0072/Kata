package com.kata.YourOrderPlease;

import org.junit.Test;
import static org.junit.Assert.*;

public class YourOrderPleaseTest {
    @Test public void mySolution(){
        MySolution solution = new MySolution();
        assertEquals("Thi1s is2 3a T4est", solution.order("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", solution.order("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("", solution.order(""));
    }
    @Test public void betterSolution(){
        BetterSolution solution = new BetterSolution();
        assertEquals("Thi1s is2 3a T4est", solution.order("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", solution.order("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("", solution.order(""));
    }
}
