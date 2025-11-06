// Static method calling another Static method
class Demo4 {
    static void greet() {
        System.out.println("Hello from static method: greet()");
    }
    static void display() {
        // direct call
        greet();
        // using class
        Demo4.greet();
    }
    public static void main(String[] args) {
        display();
    }
} 