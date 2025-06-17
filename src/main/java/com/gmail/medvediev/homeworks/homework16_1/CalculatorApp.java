package com.gmail.medvediev.homeworks.homework16_1;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введіть перше число: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double b = scanner.nextDouble();

        System.out.print("Оберіть операцію (+, -, *, /): ");
        String op = scanner.next();

        Operation operation;

        switch (op) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
            default:
                System.out.println("Невідома операція.");
                return;
        }

        try {
            double result = calculator.calculate(operation, a, b);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}