package com.gmail.medvediev.homeworks.homework10_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        System.out.println("Square of " + number + " is " + squareNumber(number));

        System.out.println("Enter radius of cylinder: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter height of cylinder: ");
        double height = scanner.nextDouble();
        System.out.println("The volume of cylinder is: " + cylinderVolume(radius, height));

        System.out.println("Enter the length of array: ");
        int arrayLength = scanner.nextInt();
        int[] array = generate(arrayLength);
        print(array);
        System.out.println();
        System.out.println("The sum of array is: " + sumArray(array));

        System.out.println("Enter you sentence: ");
        String sentence = scanner.next();
        System.out.println("Your reversed sentence: ");
        reverseSentence(sentence);
        System.out.println();

        System.out.println("Enter number you want to raise to a pow:");
        number = scanner.nextInt();
        System.out.println("Enter pow:");
        int pow = scanner.nextInt();
        System.out.println("Your final number is: " + numberInPow(number, pow));

        System.out.println("Enter number of lines you want to see: ");
        int numberOfLines = scanner.nextInt();
        System.out.println("Enter the text you want to see: ");
        String text = scanner.next();
        System.out.println("Your text is: ");
        printLines(numberOfLines, text);
    }

    public static int squareNumber(int number) {
        return number * number;
    }

    public static double cylinderVolume(double radius, double height) {
        if (height < 0 || radius < 0) {
            return 0;
        }
        double volume;
        volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    public static int[] generate(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 50);
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return null;
        }
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
        return reversed;
    }

    public static int numberInPow(int number, int pow) {
        int numberPow;
        numberPow = (int) Math.pow(number, pow);
        return numberPow;
    }

    public static void printLines(int numberOfLines, String text){
        if (text == null || numberOfLines <= 0) {
            System.out.println("Incorrect input");
            return;
        }
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(text);
        }
    }
}
