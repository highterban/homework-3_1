package com.gmail.medvediev.homeworks.homework9_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithMultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of your Even Rows:" + sumOfEvenRows(matrix));
        System.out.println("Sum of your Odd Rows:" + sumOfOddRows(matrix));
        System.out.println("Product of your Even Columns:" + productOfEvenColumns(matrix));
        System.out.println("Product of your Odd Columns:" + productOfOddColumns(matrix));
        magicSquare(matrix);
    }

    public static int sumOfEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int sumOfOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 != 0) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static long productOfEvenColumns(int[][] matrix) {
        long product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0) {
                    product *= matrix[i][j];
                }
            }
        }
        return product;
    }

    public static long productOfOddColumns(int[][] matrix) {
        long product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 != 0) {
                    product *= matrix[i][j];
                }
            }
        }
        return product;
    }

    public static void magicSquare(int[][] matrix) {
        int size = matrix.length;
        int targetSum = 0;
        boolean isMagic = true;

        for (int j = 0; j < size; j++) {
            targetSum += matrix[0][j];
        }

        for (int i = 1; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) {
                isMagic = false;
                break;
            }
        }

        if (isMagic) {
            for (int j = 0; j < size; j++) {
                int colSum = 0;
                for (int i = 0; i < size; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != targetSum) {
                    isMagic = false;
                    break;
                }
            }
        }

        if (isMagic) {
            int firstDiagonal = 0;
            for (int i = 0; i < size; i++) {
                firstDiagonal += matrix[i][i];
            }
            if (firstDiagonal != targetSum) isMagic = false;
        }

        if (isMagic) {
            int secondDiagonal = 0;
            for (int i = 0; i < size; i++) {
                secondDiagonal += matrix[i][size - 1 - i];
            }
            if (secondDiagonal != targetSum) isMagic = false;
        }

        if (isMagic) {
            System.out.println("Matrix is magic square");
        } else {
            System.out.println("Matrix is NOT magic square");
        }
    }
}