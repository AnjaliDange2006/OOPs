//Instance method calling Static method!
class Demo3 {
    static void greet() {
        System.out.println("Hello from static method: greet()");
    }
    void display() {
        // direct call
        greet();
       //using class name
        Demo3.greet();
        //Using object (
        Demo3 d = new Demo3();
        d.greet();
    }
    public static void main(String[] args) {
        new Demo3().display();
    }
} 
