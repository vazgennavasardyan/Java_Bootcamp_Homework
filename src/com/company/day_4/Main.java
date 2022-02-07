package com.company.day_4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Exercise 01
        System.out.println("Type input byte parameter: ");
        byte num = scan.nextByte();
        scan.close();
        wideningCast(num); */


        /* Exercise 02
        System.out.println("Import double number: ");
        double num = scan.nextDouble();
        scan.close();
        narrowingCast(num); */


        /* Exercise 03
        System.out.println("Import Temperature in Fahrenheit: ");
        float f = scan.nextFloat();
        scanner.close();
        fahrenheitToCelsius(int); */


        /* Exercise 04
        System.out.print("Import Radius (cm): ");
        double r = scan.nextDouble();
        scan.close();
        circleArea(r); */


        /* Exercise 09
        System.out.println("Input int value from the range 32 to 127: ");
        int num = scan.nextInt();
        scan.close();
        intToChar(num); */


        /* Exercise 10
        System.out.println("Input first string: ");
        String name_1 = scan.next();
        System.out.println("Input second string: ");
        String name_2 = scan.next();
        scan.close();
        concatenateString(name_1, name_2 ); */

    }

    // Exercise 01
    /**
     * @description Write java program, which has byte type variable(Input variables from console)
     * @param num byte type
     */
    public static void wideningCast(byte num) {

        System.out.println(num + " byte number");

        short num_1 = num;
        System.out.println(num_1 + " short number");

        int num_2 = num_1;
        System.out.println(num_2 + " int number");

        long num_3 = num_2;
        System.out.println(num_3 + " long number");

        float num_4 = num_3;
        System.out.println(num_4 + " float number");

    }

    // Exercise 02
    /**
     * @description Write java program, which has double type variable(Input variable from console)
     * @param num double type
     */
    public static void narrowingCast(double num) {

        System.out.println(num + " double number");

        float num_1 = (float) num;
        System.out.println(num_1 + " float number");

        long num_2 = (long) num_1;
        System.out.println(num_2 + " long number");

        int num_3 = (int) num_2;
        System.out.println(num_3 + " int number");

        short num_4 = (short) num_3;
        System.out.println(num_4 + " short number");

        byte num_5 = (byte) num_4;
        System.out.println(num_5 + " byte number");
    }

    // Exercise 03
    /**
     * @description Write a Java program to convert temperature from Fahrenheit to
     *  Celsius degree. (Input parameter from console)
     * @param f is the input parameter in int type
     */
    public static void fahrenheitToCelsius(int f) {

        float celsius_1 = (float) ((f - 32) / 1.8);
        int celsius_2 = (int) ((f - 32) / 1.8);

        System.out.println(celsius_1 + " °C" + celsius_2 + " °C");

    }

    // Exercise 04
    /**
     * @description Compute area  and perimeter of circle.(Input double type radius from console)(PI = 3.14159
     * @param r is the radius of the circle in double type
     */
    public static void circleArea(double r) {
        double pi = Math.PI;
        double area = pi * r * r;
        double perimeter = 2 * 3.14159 * r;
        System.out.println("The area is: " + area + " square centimeter");
        System.out.println("The perimeter is: " + perimeter + " centimeter");
    }

    // Exercise 05
    /**
     * @description Print the result of this expression 1 / 3. Takes no parameter
     */
    public static void expressionResult() {

        float r_1;
        r_1 = (float) 1 / 3;

        double r_2;
        r_2 = (double) 1 / 3;

        System.out.printf("The result as a float is: %f", r_1);
        System.out.println("The result as a double is: " + r_2);
    }

    // Exercise 06
    /**
     * @description prints Name and date of birth using only char primitive and int types
     */
    public static void nameAndBirth() {

        int dateOfBirth = 1986;
        String name = "" + 'V' + 'a' + 'z' + 'g' + 'e' + 'n';

        System.out.println("(" + name + " " + dateOfBirth + ")");

    }

    // Exercise 07
    /**
     * @description Cast char to int. Takes no input parameter
     */
    public static void castCharToInt() {

        int cast = 'a';

        System.out.println("Cast output: " + cast);
    }

    // Exercise 08
    /**
     * @description program which parses your name letters as an integers, calculate average of them. Takes no input parameter
     */
    public static void nameToInteger() {
        int name = 'V' + 'a' + 'z' + 'g' + 'e' + 'n';
        int average = name / 6;
        System.out.println("Vazgen -- " + average);
    }

    // Exercise 09
    /**
     * @description Inputs int value from console, find char value corresponding to that int value.
     * @param num int type input parameter
     */
    public static void intToChar(int num) {
        char out = (char) num;
        System.out.println(num + " - " + out);
    }

    // Exercise 10
    /**
     * @description Concatenates two strings
     * @param name_1 first input parameter as String
     * @param name_2 second input parameter as String
     */
    public static void concatenateString(String name_1, String name_2 ) {

        String output = name_1 + " " +name_2;
        System.out.println("The concatenated string output is: " + output);

    }

    // Exercise 11
    /**
     * @description What happens if concatenate string and another primitive type. Takes no input parameter
     */
    public static void stringWithPrimitive() {
        int a = 50;
        int b = 4;
        String str = "100";
        double dou = 3.74;

        System.out.println("Int with int concatenation: " + (a + b));
        System.out.println("String  + integer with other primitive types: " + ((str + a) + dou));
    }

    // Exercise 12
    /**
     * @description prints the text, Takes no input parameter
     */
    public static void stringPrint() {
        String txt;
        txt = "We \t are the \b so-called \"Vikings\" from \n the \r north.";
        System.out.println(txt);

    }

    // Exercise 13
    /**
     * @description swaps two numbers. Takes no input parameter
     */
    public static void swap() {
        int a = 5;
        int b = 6;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " \n"+ b);

    }
}
