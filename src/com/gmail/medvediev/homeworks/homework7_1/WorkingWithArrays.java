package com.gmail.medvediev.homeworks.homework7_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithArrays {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("You array is: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(-100, 101);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        sumOfNegativeNumbers(numbers);
        evenAndOddNumbers(numbers);
        findingMaxAndMin(numbers);
        averageNumberAfterNegative(numbers);
    }

    public static void sumOfNegativeNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Summary of array's negative numbers:" + sum);
    }

    public static void evenAndOddNumbers(int[] numbers) {
        int countEven = 0;
        int countOdd = 0;
        System.out.println("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.print(countEven);
        System.out.println();
        System.out.println("Odd numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.print(countOdd);
        System.out.println();
    }

    public static void findingMaxAndMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Max number: " + max + " Index of max number: " + maxIndex);
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Min number: " + min + " Index of min number: " + minIndex);

    }

    public static void averageNumberAfterNegative(int[] numbers) {

        int arrayIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                arrayIndex = i;
                break;
            }
        }
        if (arrayIndex == -1) {
            System.out.println("There are no negative numbers in the array.");
            return;
        }

        int count = numbers.length - arrayIndex - 1;

        if (count == 0) {
            System.out.println("There are no elements after the first negative number.");
            return;
        }

        int sum = 0;
        for (int i = arrayIndex + 1; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / count;

        System.out.println("Average number after first negative: " + average);
    }
}

