package com.gmail.medvediev.homeworks.homework6_1;

import java.util.Scanner;

public class CalculatingWithCycles {
    public static void main(String[] args) {
       firstMethod();
    }

    public static void firstMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert border:");
        int border = scanner.nextInt();
        int sum = 0;

        for (int num = 1; num <= border; num++) {
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
    public static void secondMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert border:");
        int border = scanner.nextInt();
        int sum = 0;
        int num = 0;
        while (num<border){
            num++;
            sum+=num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void thirdMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert border:");
        int border = scanner.nextInt();
        int sum = 0;
        int num = 0;
        do{
            num++;
            sum+=num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);
        } while(num<border);
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

}
