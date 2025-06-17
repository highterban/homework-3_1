package com.gmail.medvediev.homeworks.homework4_1;

public class SalesAmount {
    public static void main(String[] args) {
        String productName = "smartphone";
        int amountOfDays = 6;
        double price = 1150.55;
        int amountOfSales = 47;
        double totalSales = price * amountOfSales;
        double averageSales = totalSales / amountOfDays;
        System.out.printf("Product No 1: %s, %n", productName);
        System.out.printf("total sales for %d days is EUR %.2f,%n", amountOfDays, totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", averageSales);

        productName = "laptop";
        amountOfDays = 11;
        price = 1565.65;
        amountOfSales = 16;
        totalSales = price * amountOfSales;
        averageSales = totalSales / amountOfDays;
        System.out.printf("Product No 2: %s, %n", productName);
        System.out.printf("total sales for %d days is EUR %.2f,%n", amountOfDays, totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", averageSales);
    }
}
