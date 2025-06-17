package com.gmail.medvediev.homeworks.homework11_1;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void getInfo() {
        System.out.printf("Name: %s, Age: %d, Profession: %s\n", name, age, profession);
    }
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }
}
