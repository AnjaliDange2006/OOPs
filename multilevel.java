package com.multilevel;
class Employee {
    void companydetails() {
        System.out.println("Please God, I want to work in my dream company.");
    }
}
interface Developer {
    void role();
}

interface Manager {
    void responsibility();
}
public class Teamlead extends Employee implements Developer, Manager {

    public void role() {
        System.out.println("Develops and reviews software modules.");
    }
    public void responsibility() {
        System.out.println("Leads the team and manages the development process.");
    }

    public static void main(String[] args) {
        Teamlead t1 = new Teamlead();

        t1.companydetails();   // from Employee (class)
        t1.role();             // from Developer (interface)
        t1.responsibility();   // from Manager (interface)
    }
}
