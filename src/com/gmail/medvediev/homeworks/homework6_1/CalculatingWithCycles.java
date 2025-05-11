package com.gmail.medvediev.homeworks.homework6_1;

import java.util.Scanner;

public class CalculatingWithCycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert border:");
        int border = scanner.nextInt();
        int sum = 0;
        int num = 0;
        System.out.println("First method:");
        firstMethod(border, sum);
        System.out.println("Second method:");
        secondMethod(num, border, sum);
        System.out.println("Third method:");
        if (border > 0) {
            thirdMethod(num, border, sum);
        }
       else{
            System.out.println("------------------------");
            System.out.println("Sum of numbers is " + sum);
        }
    }

    public static void firstMethod(int border, int sum) {
        for (int num = 1; num <= border; num++) {
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void secondMethod(int num, int border, int sum) {

        while (num < border) {
            num++;
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void thirdMethod(int num, int border, int sum) {
        do {
            num++;
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        } while (num < border);
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

}
