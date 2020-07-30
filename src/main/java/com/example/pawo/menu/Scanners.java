package com.example.pawo.menu;

import java.util.Scanner;

public class Scanners implements ScannerValue {

    private static final Scanner inp = new Scanner(System.in);

    @Override
    public double getValue() {
        return inp.nextDouble();
    }
}
