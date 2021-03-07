package com.example.pawo.calculator;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.example.pawo.menu.App;
import com.example.pawo.menu.Calculator;
import com.example.pawo.menu.Scanners;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 * IMPORTANT TO HAVE A TEST IN APPTEST
 */

public class AppTest extends TestCase {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void testMainMethod() {
        Scanners app = Mockito.mock(Scanners.class);
        when(app.getValue()).thenReturn(10.0);
        app.getValue();
        verify(app,times(1)).getValue();
    }

    @Test
    public void testRun() {
        Scanners mock = Mockito.mock(Scanners.class);
        when(mock.getValue()).thenReturn(2.0);
        when(mock.getValue()).thenReturn(1.0);
        Calculator calc = new Calculator(mock);
        boolean result = calc.run();
        assertEquals(result, true);
    }

//    @Test
//    public void testRunBadOperation() {
//        Scanners mock = Mockito.mock(Scanners.class);
//        when(mock.getValue()).thenReturn(2.0);
//        when(mock.getValue()).thenReturn(8.0);
//        Calculator calc = new Calculator(mock);
//        boolean result = calc.run();
//        assertEquals(result, false);
//    }

    @Test
    public void testOperationAddition() {
        Scanners mock = Mockito.mock(Scanners.class);
        Calculator calc = new Calculator(mock);
        double a = 5, b = 6;
        int op = 1;

        assertEquals(calc.program(a, b, op), a + b);
    }

    @Test
    public void testOperationSubstraction() {
        Scanners mock = Mockito.mock(Scanners.class);
        Calculator calc = new Calculator(mock);
        double a = 5, b = 6;
        int op = 2;

        assertEquals(calc.program(a, b, op), a - b);
    }

    @Test
    public void testOperationMultiplication() {
        Scanners mock = Mockito.mock(Scanners.class);
        Calculator calc = new Calculator(mock);
        double a = 5, b = 6;
        int op = 3;

        assertEquals(calc.program(a, b, op), a * b);
    }

    @Test
    public void testOperationDivision() {
        Scanners mock = Mockito.mock(Scanners.class);
        Calculator calc = new Calculator(mock);
        double a = 5, b = 6;
        int op = 4;

        assertEquals(calc.program(a, b, op), a / b);
    }

    @Test
    public void testOperationInvalid() {
        Scanners mock = Mockito.mock(Scanners.class);
        Calculator calc = new Calculator(mock);
        double a = 5, b = 6;
        int op = 0;

        assertEquals(calc.program(a, b, op), 0.0);
    }

    @Test
    public void testRoot() {
        final Root operation = new Root();
        double a = 5;
        double result = Math.sqrt(a);
        assertEquals(result, operation.operation(a));

    }
}
