// Can instance method call another instance method
package com.oop;

class Demo {
    void greet() { // instance method
        System.out.println("hey i am anjali");
    }

    void display() { // another instance method
        greet();        // direct call
        this.greet();   // using this
        Demo d = new Demo(); // new object
        d.greet();      // using object
    }

    public static void main(String[] args) {
        Demo d = new Demo(); // create object
        d.display();         // call display method
    }
}
