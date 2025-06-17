package com.gmail.medvediev.homeworks.homework8_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithAlgorithms {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("You array is: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        System.out.print(Arrays.toString(numbers));
        System.out.println();
        System.out.println("Your sorted array is: ");
        insertionSort(numbers);
        System.out.println("Insert number you want to find: ");
        int target = scanner.nextInt();
        int index = binarySearch(numbers, target);
        System.out.println("Index of number you search: " + index);
    }

    public static void insertionSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 1; i < n; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

