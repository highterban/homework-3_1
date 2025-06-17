package com.gmail.medvediev.homeworks.homework9_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkingWithMultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int sizeRows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int sizeColumns = scanner.nextInt();
        int[][] matrix = new int[sizeRows][sizeColumns];
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
        String isMagic;
        if (isMagicSquare(matrix)) {
            isMagic = "It is a magic square";
        } else {
            isMagic = "It is not a magic square";
        }
        System.out.print(isMagic);
    }

    public static int sumOfEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i += 2) {
            sum += rowSum(matrix, i);
        }
        return sum;
    }

    public static int sumOfOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i += 2) {
            sum += rowSum(matrix, i);
        }
        return sum;
    }

    public static long productOfEvenColumns(int[][] matrix) {
        long product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    public static long productOfOddColumns(int[][] matrix) {
        long product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j += 2) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    public static int rowSum(int[][] matrix, int rowNumber) {
        int sum = 0;
        for (int j = 0; j < matrix[rowNumber].length; j++) {
            sum += matrix[rowNumber][j];
        }
        return sum;
    }

    public static int columnSum(int[][] matrix, int columnNumber) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnNumber];
        }
        return sum;
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;

        for (int[] row : matrix) {
            if (row.length != size) {
                return false;
            }
        }

        int targetSum = rowSum(matrix, 0);

        for (int i = 1; i < size; i++) {
            if (rowSum(matrix, i) != targetSum) {
                return false;
            }
        }

        for (int j = 0; j < size; j++) {
            if (columnSum(matrix, j) != targetSum) {
                return false;
            }
        }

        int firstDiagonal = 0;
        for (int i = 0; i < size; i++) {
            firstDiagonal += matrix[i][i];
        }
        if (firstDiagonal != targetSum) {
            return false;
        }

        int secondDiagonal = 0;
        for (int i = 0; i < size; i++) {
            secondDiagonal += matrix[i][size - 1 - i];
        }

        return secondDiagonal == targetSum;

    }
}