package com.example.pawo.calculator;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTestOperation extends TestCase {

    @Test
    public void testAddition() {
        final Addition operation = new Addition();

        double a = 5, b = 6;
        double c = a + b;

        assertEquals(c, operation.operation(a, b));
    }

    @Test
    public void testSubstraction() {
        final Substraction operation = new Substraction();

        double a = 5, b = 6;
        double c = a - b;

        assertEquals(c, operation.operation(a, b));
    }

    @Test
    public void testMultipication() {
        final Multiplication operation = new Multiplication();

        double a = 5, b = 6;
        double c = a * b;

        assertEquals(c, operation.operation(a, b));
    }

    @Test
    public void testDivision() {
        final Division operation = new Division();

        double a = 5, b = 6;
        double c = a / b;

        assertEquals(c, operation.operation(a, b));
    }

    @Test
    public void testDivisionError() {
        final Division operation = new Division();
        double a = 5, b = 0;
        double result = Double.POSITIVE_INFINITY;
        assertEquals(result, operation.operation(a, b));

    }
}
