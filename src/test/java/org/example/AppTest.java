package org.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testComputeEquationFor7() {
        App apptest = new App();
        int expected =  7 * 3 + 1; // if x is even, divide by 2, if x is odd, multiply by 3 and add 1;
        int actual = apptest.computeEquation(7); // should be 22
        assertEquals(expected, actual);
    }

    public void testComputeEquationFor2() {
        App apptest = new App();
        int expected =  2 / 2; // if x is even, divide by 2, if x is odd, multiply by 3 and add 1;
        int actual = apptest.computeEquation(2); // should be 22
        assertEquals(expected, actual);
    }


    public void testComputeEquationFor22() {
        App apptest = new App();
        int expected =  22 / 2; // if x is even, divide by 2, if x is odd, multiply by 3 and add 1;
        int actual = apptest.computeEquation(22); // should be 22
        assertEquals(expected, actual);
    }

    public void testComputeEquationFor11() {
        App apptest = new App();
        int expected =  34; // if x is even, divide by 2, if x is odd, multiply by 3 and add 1;
        int actual = apptest.computeEquation(11); // should be 22
        assertEquals(expected, actual);
    }
    public void testDelta() {
        App apptest = new App();
        double expected =  10.0 - (3.0 + (1/3.0)); //
        double actual =  6.6666; //
        assertEquals(expected, actual, 0.01);
    }


}