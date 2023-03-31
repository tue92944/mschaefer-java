package org.example.inheritanceexercise;



public class GiftCardPayment extends Payment{
    private String accountNumber;
    private double balance;
    private int loyaltyPoints;

    public GiftCardPayment(int id, double amount, String accountNumber, double balance, int loyaltyPoints) {
        super(id, amount);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing gift card and adding loyalty points...");
        if (balance >= getAmount()) {
            balance -= getAmount();
            loyaltyPoints += getAmount() * 100;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "  Type:  Gift Card  Balance:  " + String.format("%.2f", balance)
                + "  Loyalty Points:  " + loyaltyPoints;
    }
}
