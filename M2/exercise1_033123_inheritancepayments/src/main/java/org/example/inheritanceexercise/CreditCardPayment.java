package org.example.inheritanceexercise;

public class CreditCardPayment extends Payment{

    private long accountNumber;
    private String cardVendor;

    public CreditCardPayment(int id, double amount, long accountNumber, String cardVendor) {
        super(id, amount);
        this.accountNumber = accountNumber;
        this.cardVendor = cardVendor;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardVendor() {
        return cardVendor;
    }

    public void setCardVendor(String cardVendor) {
        this.cardVendor = cardVendor;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing via: " + cardVendor + " for: $" + getAmount());
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "  Type:  Credit Card  Vendor: " + cardVendor;
    }
}
