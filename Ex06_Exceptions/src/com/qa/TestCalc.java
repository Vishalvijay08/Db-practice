package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        try {
            // Something that may throw an exception
            System.out.println("Div result: " + bc.div(6, 0));
        } catch (ArithmeticException ae) {
            // Do something about the exception if one is raised
            System.out.println("Calculation error caught");
        }
    }
}
