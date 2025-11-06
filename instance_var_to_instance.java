class Demo3 {
    int a = 30; // instance variable

    void m1() { // instance method
        System.out.println("The value of a is " + a); // direct access
        Demo3 d1 = new Demo3(); // new object
        System.out.println(d1.a); // access using object
    }

    public static void main(String[] args) {
        Demo3 d1 = new Demo3(); // create object
        System.out.println(d1.a); // access instance variable
    }
}