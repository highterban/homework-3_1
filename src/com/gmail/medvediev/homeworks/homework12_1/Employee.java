package com.gmail.medvediev.homeworks.homework12_1;

public class Employee {
    private String name;
    private String job;
    private String email;
    private double phone;
    private int age;
    public Employee(String name, String job, String email, double phone, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public double getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
    public String getInfo(){
        return "Name:" + name + " Job:" + job + " Email:" + email + " Phone:" + phone + " Age:" + age;
    }
}
