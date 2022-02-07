package com.company.day_5;

public class Book {

    // Initializing class parameters
    String name;
    Author author;
    int price;

    // Constructor
    public Book(String name, Author author, int price) {

        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * @description this method prints the book`s information
     */
    public void infoBook() {
        System.out.println("All information about book" + "\n" + "Book`s name: " + this.name + "\n" + "Book`s price: " + this.price + " USD" + "\n");

    }

    /**
     * @Description this method prints the name and email of the author. to print the name employee class has been used
     */
    public void nameAndEmail() {
        System.out.println("Name and Email of the author" + "\n" + "Author`s name: " + this.author.name + "\n" + "Author`s email: " + this.author.email + "\n");
    }



}
