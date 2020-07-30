package com.example.pawo.menu;

public class App {

    public static void main(String[] args) {
        final ScannerValue scannerValue = new Scanners();
        final Calculator calc = new Calculator(scannerValue);
        calc.run();
    }
}
