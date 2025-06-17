package com.gmail.medvediev.homeworks.homework5_1;

import java.util.Scanner;

public class CalculatingTaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextInt();
        double taxes;
        if (income > 0 && income <= 10000) {
            taxes = income * 0.025;
            System.out.printf("Your taxes are %.2f", taxes);
        }
        else if (income > 10000 && income <= 25000) {
            taxes = income * 0.043;
            System.out.printf("Your taxes are %.2f", taxes);
        }
        else if (income > 25000) {
            taxes = income * 0.067;
            System.out.printf("Your taxes are %.2f", taxes);
        }
        else {
            System.out.println("Incorrect input");
        }
    }
}
