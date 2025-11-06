// Can instance variable be used in instance method => Yes
package com.oop;

class Demo2 {
    int value = 30; // instance variable

    static void print() { // static method
        // create object to access instance variable
        Demo2 d = new Demo2();
        System.out.println("The value is " + d.value);
    }

    public static void main(String[] args) {
        print(); // call static method
    }
}
