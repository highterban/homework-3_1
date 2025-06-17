package com.gmail.medvediev.homeworks.homework11_1;

public class PersonInfo {
    public static void main(String[] args) {
        Person firstPerson = new Person ("Evgeniy", 21 , "Software developer");
        Person secondPerson = new Person ("Nickolay", 54 , "Policeman");
        Person thirdPerson = new Person ("Mariya", 34 , "Scientist");

        firstPerson.getInfo();
        secondPerson.getInfo();
        thirdPerson.getInfo();

        System.out.println();
        Person fourthPerson = new Person ("Vitaliy", 43 , "Bus driver");
        fourthPerson.getInfo();
        System.out.println("After changing profession");
        fourthPerson.setProfession("Personal driver");
        fourthPerson.getInfo();
    }
}
