package com.gmail.medvediev.homeworks.homework12_1;

public class PersonDriveTheCar  {
    public static void main(String[] args) {
        Employee employee = new Employee("Max", "Cook", "maxcook21@gmai.com", 380160050, 21);
        System.out.println("The employee: ");
        System.out.println(employee.toString());
        System.out.println("Start his car: ");

        Car car = new Car();
        car.start();
    }
}
