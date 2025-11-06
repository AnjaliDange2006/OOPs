// Example of multiple constructors in Java
package com.oop;

public class User {
    int id;
    String name;
    int age;
    static String clgname = "DYP"; // same college name for all users

    // Default constructor
    User() {
        System.out.println("Hello guys!"); 
    }

    // Constructor with 2 parameters
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with 3 parameters
    User(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    // Method to print user details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("College: " + clgname);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        User sakshi = new User();

        // Creating object using 3 parameter constructor
        User anjali = new User(19, 1, "Anjali");

        System.out.println("\nInformation of Sakshi:");
        sakshi.display();

        System.out.println("===========================");
        System.out.println("Information of Anjali:");
        anjali.display();

        System.out.println("===========================");
        System.out.println("Information of another user (Vaishnavi):");

        // Copying reference of anjali object to vaishnavi
        User vaishnavi = anjali;

        // Changing values using vaishnavi reference
        vaishnavi.name = "Vaishnavi";
        vaishnavi.age = 20;

        // This will also update anjali's data since both point to same object
        vaishnavi.display();
    }
}