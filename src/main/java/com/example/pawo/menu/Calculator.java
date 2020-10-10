package com.example.pawo.menu;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.pawo.calculator.*;

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

        logger.log(Level.INFO,"Enter your selection:\n 1 for Addition,\n 2 for Substraction, \n 3 for Multiplication,\n 4 for Division, \n (Only first number): \n 5 for Root,\n 6 for Power Square, \n 7 for Power Cube, \n 8 for Reverse :");
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
            case 5:
                return new Root().operation(a);
            case 6:
                return new PowerSquare().operation(a);
            case 7:
                return new PowerCube().operation(a);
            case 8:
                return new Reverse().operation(a);
                //Procent
                //sinus
                //cosinus
                //tangens
                //cotangens

            default:
                return 0;

        }
    }
}
