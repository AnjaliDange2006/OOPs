//can static method calls instance method=>no 
package com.oop;
class Demo{
void show(){
    System.out.println("this is instance method");
}
static void display(){
    //show();--we cant call instace method directly
        //we can call through object
    Demo d1=new Demo();
    d1.show();
    System.out.println("this is a static method");
}
public static void main(String[] args){
    display();
        Demo d1=new Demo();
    d1.show();
}
}