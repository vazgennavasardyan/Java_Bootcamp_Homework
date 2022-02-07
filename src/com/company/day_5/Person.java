package com.company.day_5;

public class Person {

    // Initializing class parameters
    String name;
    int age;
    String address;

    // No argument constructor
    public Person() {

    }

    // All argument constructor is defined
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * @description this method prints all information about person.
     * returns no value. Type is void.
     */
    public void personInfo() {
        System.out.println("Name of the Person is: " + this.name + "\n" + "Age: " + this.age + "\n" + "Address: " + this.address);
    }





}
