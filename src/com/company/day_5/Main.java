package com.company.day_5;

public class Main {
    public static void main(String[] args) {

        // "Person Class" exercise
//        Person person_1 = new Person("Aram", 26, "Aram street 48");
//        person_1.personInfo();
//
//        Person person_2 = new Person("Mike", 28, "Koryun street 11");
//        person_2.personInfo();

        // "Employee Class" exercise
//        Employee employee_1 = new Employee(16511, "Aram", "Computer Science", 18, "male");
//        employee_1.infoEmployee();
//        Employee employee_2 = new Employee(14633, "Karen", "Computer Science", 19, "male");
//        employee_2.infoEmployee();
//        Employee employee_3 = new Employee(68221, "Sahak", "Computer Science", 18, "male");
//        employee_3.infoEmployee();
//        Employee employee_4 = new Employee(87623, "Mari", "Accounting", 25, "female");
//        employee_4.infoEmployee();
//        Employee employee_5 = new Employee(87422, "Sara", "Math", 21, "female");
//        employee_5.infoEmployee();


        // "Author Class" exercise
//        Author author = new Author("Herbert Schildt", "herbert.schildt@info.com", "male");
//        author.infoAuthor();


        // "Book Class" exercise
        Author a = new Author("Herbert", "herbert.schildt@info.com", "male");
        Book book = new Book("Java Programming", a,  25);
        book.infoBook();
        book.nameAndEmail();

    }
}
