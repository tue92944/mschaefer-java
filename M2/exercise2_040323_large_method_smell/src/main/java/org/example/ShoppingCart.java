package org.example;

public class ShoppingCart {
    public double checkoutShoppingCart (Item[] items, double taxRate, double discountCode) {
        double subtotal = calculateSubTotal(items);
        double discount = calculateDiscount(subtotal,discountCode);
        subtotal -= discount;
        double tax = calculateTax(subtotal, taxRate);
        return subtotal + tax;
    }

    public double calculateSubTotal(Item[] items){
        double subtotal = 0.00;
        for (int i = 0; i < items.length; i++) {
            subtotal += items[i].getPrice();
        }
        return subtotal;
    }

    public double calculateDiscount(double subTotal, double discountCode){
        double discount = subTotal * discountCode;
        return discount;
    }

    public double calculateTax(double subTotal, double taxRate){
        double tax = (subTotal) * taxRate;
        return tax;
    }
}
