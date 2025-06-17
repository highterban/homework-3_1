package com.gmail.medvediev.calculatoruser;

import com.gmail.medvediev.homeworks.homework16_1.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.calculate(new Addition(), 2, 3));
        System.out.println("5 - 2 = " + calculator.calculate(new Subtraction(),5, 2));
        System.out.println("4 * 6 = " + calculator.calculate(new Multiplication(),4, 6));
        System.out.println("8 / 2 = " + calculator.calculate(new Division(),8, 2));
    }
}
