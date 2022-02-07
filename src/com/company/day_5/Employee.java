package com.company.day_5;

public class Employee {

    // Initializing class parameters
    int id;
    String name;
    String department;
    int age;
    String gender;

    // All argument constructor is defined
    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this. age = age;
        this.gender = gender;
    }

    /**
     * @description prints out Employee`s information. Returns no value
     */
    public void infoEmployee() {
        System.out.println("Employee`s information desk " + "\n" + "ID: " + this.id + "\n"+ "Name: " + this.name + "\n" + "Department: " + this.department + "\n" + "Age: " + this.age + "\n" + "Gender: " + this.gender + "\n");
    }


}
