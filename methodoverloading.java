package Payments;

public class Phonepay {
    
    // Process payment using UPI ID
    void processPayment(String UPI) {
        System.out.println("Payment done successfully using UPI ID: " + UPI);
    }

    //using amount (for example, wallet balance)
    void processPayment(double amount) {
        System.out.println("Payment of " + amount + " done successfully from wallet.");
    }

    //using debit card number
    void processPayment(int debitcardno) {
        System.out.println("Payment done successfully using Debit Card No: " + debitcardno);
    }

    public static void main(String[] args) {
        Phonepay user1 = new Phonepay();
        user1.processPayment("anjali");      // by UPI
        user1.processPayment(500.75);           // by wallet amount
        user1.processPayment(12345678);         // by debit card number
    }
}
