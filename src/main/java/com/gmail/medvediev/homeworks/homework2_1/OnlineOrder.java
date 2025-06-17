package com.gmail.medvediev.homeworks.homework2_1;

public class OnlineOrder {
    public static void main(String[] args) {
        double price = 305.99;
        byte number = 1;
        byte adressNumber= 10;

        String customerName = "Alice";
        String adress = "Moon Street,";
        String productName = "smartphone";

        System.out.println("Order No " + number + " Client: " + customerName + ".");
        System.out.println("Product: " + productName + ",");
        System.out.println("Price" + " EUR " + price + ".");
        System.out.println("Address: " + adress + " " + adressNumber + ".");

        price = 570.95;
        number = 2;
        adressNumber = 17;
        customerName = "Tom";
        adress = "Terra Street,";
        productName = "laptop";

        System.out.println("Order No " + number + " Client: " + customerName + ".");
        System.out.println("Product: " + productName + ",");
        System.out.println("Price" + " EUR " + price + ".");
        System.out.println("Address: " + adress + " " + adressNumber + ".");
    }
}