package com.example.pawo.menu;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.pawo.calculator.Addition;
import com.example.pawo.calculator.Division;
import com.example.pawo.calculator.Multiplication;
import com.example.pawo.calculator.Substraction;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());
    private ScannerValue scannerValue;

    public Calculator(ScannerValue scannerValue) {
        this.scannerValue = scannerValue;
    }

    public boolean run() {
        logger.log(Level.INFO,"Enter first number:");
        double a = this.scannerValue.getValue();

        logger.log(Level.INFO,"Enter second number:");
        double b = this.scannerValue.getValue();

        logger.log(Level.INFO,"Enter your selection: 1 for Addition, 2 for Substraction 3 for Multiplication and 4 for Division:");
        int choose = (int)this.scannerValue.getValue();

        double result = program(a, b, choose);
        if (result == 0) {
            logger.log(Level.INFO, "Invalid Operation");
            return false;
        } else {
            logger.log(java.util.logging.Level.SEVERE, "Result: {0}", result);
        }
        logger.log(Level.INFO, "Program has ended successfully!");
        return true;
    }

    public double program(double a, double b, int choose) {
        switch (choose) {
            case 1:
                return new Addition().operation(a, b);
            case 2:
                return new Substraction().operation(a, b);
            case 3:
                return new Multiplication().operation(a, b);
            case 4:
                return new Division().operation(a, b);
            default:
                return 0;

        }
    }
}
