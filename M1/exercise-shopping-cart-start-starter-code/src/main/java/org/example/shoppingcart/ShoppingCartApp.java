package org.example.shoppingcart;
import java.util.Arrays;

public class ShoppingCartApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart app!");

        int productID = 1;
        int productCategory = 2;
        float productCost = 2.56f;
        float productPrice = 4.99f;
        int productQuantity = 78;


        float totalCost = productQuantity * productCost;
        System.out.println("Total Cost is $" + totalCost);


        float profitMargin = (productPrice - productCost);
        System.out.printf("Profit Margin = $%.2f", profitMargin);

        float potentialProfit = (profitMargin * productQuantity);
        System.out.println("\nPotential profit is $" + potentialProfit);

        //declare all values of enum in an array
        OrderStatus[] orderStatus = OrderStatus.values();
        ShippingStatus[] shippingStatus = ShippingStatus.values();

        //print out enum values after converting to a string
        System.out.println(Arrays.toString(orderStatus));
        System.out.println(Arrays.toString(shippingStatus));
        System.out.println("Bye");
    }
}
