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

        //get user input for shipping and quantity
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you tax-exempt?Y/N");
        String taxExempt = sc.nextLine();

        System.out.println("Shipping? Y/N");
        String shipping = sc.nextLine();

        System.out.println("What type of shipping? Standard/TwoDay/Overnight");
        String shippingType = sc.nextLine().toLowerCase();

        System.out.println("Order quantity?");
        String quantityStr = sc.nextLine();
        int quantity = Integer.parseInt(quantityStr);

        System.out.println("Promo code for free shipping?");
        String promoCode = sc.nextLine();

        System.out.println("Details:");
        System.out.printf("Tax-Exempt? %s\nShipping? %s\nOrder Quantity: %s\nPromo Code: %s\n", taxExempt, shipping, quantity, promoCode);


        float profitMargin = (productPrice - productCost);
        float potentialProfit = (profitMargin * quantity);
        float taxRate = .07f;
        float standardShipping = 2.00f;
        float twoDayShipping = 5.00f;
        float overnightShipping = 10.00f;
        float totalCost = (quantity * productCost)* taxRate;
        float totalCostTaxExempt = quantity * productCost;

        //declare all values of enum in an array
        OrderStatus[] orderStatus = OrderStatus.values();
        ShippingStatus[] shippingStatus = ShippingStatus.values();

        //print out enum values after converting to a string
        System.out.println(Arrays.toString(orderStatus));
        System.out.println(Arrays.toString(shippingStatus));

        if (taxExempt.equals("Y")){
            if (shipping.equals("N")){
                System.out.printf("Your total cost without tax or shipping is: %s", totalCostTaxExempt);
            }else{
                switch(shippingType) {
                    case "standard": {
                        totalCostTaxExempt += standardShipping;
                        System.out.printf("Your total cost without tax and standard shipping is: %s", totalCostTaxExempt);
                        break;
                    }
                    case "twoday": {
                        totalCostTaxExempt += twoDayShipping;
                        System.out.printf("Your total cost without tax and two-day shipping is: %s", totalCostTaxExempt);
                        break;
                    }
                    case "overnight": {
                        totalCostTaxExempt += overnightShipping;
                        System.out.printf("Your total cost without tax and overnight shipping is: %s", totalCostTaxExempt);
                        break;
                    }
                }
            }
        } else{
            if (shipping.equals("N")){
                System.out.printf("Your total cost with tax and no shipping is: %s", totalCost);
            }else{
                switch(shippingType) {
                    case "standard": {
                        totalCost += standardShipping;
                        System.out.printf("Your total cost with tax and standard shipping is: %s", totalCost);
                        break;
                    }
                    case "twoday": {
                        totalCost += twoDayShipping;
                        System.out.printf("Your total cost with tax and two-day shipping is: %s", totalCost);
                        break;
                    }
                    case "overnight": {
                        totalCost += overnightShipping;
                        System.out.printf("Your total cost with tax and overnight shipping is: %s", totalCost);
                        break;
                    }
                }
            }





        }

        //STRING EXERCISE
//        String businessName = "Shopping Mania";
//        String contactInfo = "909-123-5678";
//        String itemDescription = "Fresh Bananas";
//
//        System.out.println(businessName);
//        System.out.println(contactInfo);
//        System.out.println(itemDescription);

        //DECISIONS EXERCISE











        System.out.println("Bye");
    }
}
