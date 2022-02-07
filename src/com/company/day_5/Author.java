package com.company.day_5;

public class Author {

    // Initializing class parameters
    String name, email, gender;

    // All argument constructor is defined
    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * @Description Prints out Author`s information, returns no value
     */
    public void infoAuthor() {
        System.out.println("Author`s information" + "\n" + "Name: " + this.name + "\n" + "Email: " + this.email + "\n" + "Gender: " + this.gender + "\n");
    }

}
