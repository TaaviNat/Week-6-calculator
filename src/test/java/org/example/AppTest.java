package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase {
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(10, App.add(5, 5));
        assertEquals(0, App.add(0, 0));
        assertEquals(-5, App.add(-2, -3));
    }

    public void testSubtract() {
        assertEquals(5, App.subtract(10, 5));
        assertEquals(0, App.subtract(5, 5));
        assertEquals(0, App.subtract(0, 0));
        assertEquals(-5, App.subtract(-2, 3));
    }

    public void testMultiply() {
        assertEquals(6, App.multiply(2, 3));
        assertEquals(25, App.multiply(5, 5));
        assertEquals(0, App.multiply(0, 0));
        assertEquals(6, App.multiply(-2, -3));
    }

    public void testDivide() {
        assertEquals(2, App.divide(10, 5));
        assertEquals(1, App.divide(5, 5));
        assertEquals(0, App.divide(0, 5));
        assertEquals(-2, App.divide(-6, 3));
    }
}
