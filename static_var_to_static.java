// Can we access static variable in static method=>yes
package com.oop;
class Demo1 {
    // static variable (belongs to class)
    static int num = 10;
    // static method
    static void show() {
        System.out.println(num); // access static variable directly
    }
    public static void main(String[] args) {
        show(); // calling static method without object

        Demo1 a = new Demo1(); // create object
        System.out.println(a.num); // access static variable with object
    }
}