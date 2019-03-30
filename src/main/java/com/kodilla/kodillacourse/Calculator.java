package com.kodilla.kodillacourse;

public class Calculator {

    public void add(double a, double b) {
        System.out.println("The result equals: " + (a + b));
    }

    public void substract(double a, double b) {
        System.out.println("The result equals: " + (a - b));
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.add(5.2,1.2);
        obj.substract(4.3,2.3);
    }
}
