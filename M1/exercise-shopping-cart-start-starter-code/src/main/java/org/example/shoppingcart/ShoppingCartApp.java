package org.example.shoppingcart;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart app!");

        int productID = 1;
        int productCategory = 2;
        float productCost = 2.56f;
        float productPrice = 4.99f;
        int productQuantity = 78;


//        float totalCost = productQuantity * productCost;
//        System.out.println("Total Cost is $" + totalCost);
//
//
//        float profitMargin = (productPrice - productCost);
//        System.out.printf("Profit Margin = $%.2f", profitMargin);
//
//        float potentialProfit = (profitMargin * productQuantity);
//        System.out.println("\nPotential profit is $" + potentialProfit);
//
//        //declare all values of enum in an array
//        OrderStatus[] orderStatus = OrderStatus.values();
//        ShippingStatus[] shippingStatus = ShippingStatus.values();
//
//        //print out enum values after converting to a string
//        System.out.println(Arrays.toString(orderStatus));
//        System.out.println(Arrays.toString(shippingStatus));
//
//        //STRING EXERCISE
//        String businessName = "Shopping Mania";
//        String contactInfo = "909-123-5678";
//        String itemDescription = "Fresh Bananas";
//
//        System.out.println(businessName);
//        System.out.println(contactInfo);
//        System.out.println(itemDescription);

        //CONSOLE IO EXERCISE
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you tax-exempt?Y/N");
        String taxExempt = sc.nextLine();

        System.out.println("Shipping? Y/N");
        String shipping = sc.nextLine();

        System.out.println("Order quantity?");
        String quantityStr = sc.nextLine();
        int quantity = Integer.parseInt(quantityStr);

        System.out.println("Promo code for free shipping?");
        String promoCode = sc.nextLine();

        System.out.println("Details:");
        System.out.printf("Tax-Exempt? %s\nShipping? %s\nOrder Quantity: %s\nPromo Code: %s\n", taxExempt, shipping, quantity, promoCode);







        System.out.println("Bye");
    }
}
