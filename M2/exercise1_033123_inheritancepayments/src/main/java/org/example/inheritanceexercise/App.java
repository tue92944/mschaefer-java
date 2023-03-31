package org.example.inheritanceexercise;

public class App {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];

        //Create your sample payments here
        payments[0] = new DirectDebitPayment(1,100.00, 4567813,341,"TD Bank", 1.50);
        payments[1] =new CreditCardPayment(2,200.00, 568725, "Visa");
        payments[2] = new GiftCardPayment(3,35.00, "918419", 59.56, 400);



        //Payments Report
        for (Payment p : payments) {
            System.out.println(p.toString());
        }

        //Payment Processing Report
        for (Payment p : payments) {
            p.processPayment();
        }

        //Uncomment this section after implementing GiftCardPayment to verify that balances are correct after processing
//        //Post processing gift card balance check
        for (Payment p : payments) {
            if (p instanceof GiftCardPayment) {
                System.out.println(p.toString());
            }
        }
    }
}
