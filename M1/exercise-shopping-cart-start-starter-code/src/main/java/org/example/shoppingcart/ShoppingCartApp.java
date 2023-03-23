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
        float fiveHundredDiscountWithTax = totalCost * .1f;
        float fiveHundredDiscountWithoutTax = totalCostTaxExempt * .1f;
        float oneHundredDiscountWithTax = totalCost * .05f;
        float oneHundredDiscountWithoutTax = totalCostTaxExempt * .05f;

        //declare all values of enum in an array
//        OrderStatus[] orderStatus = OrderStatus.values();
//        ShippingStatus[] shippingStatus = ShippingStatus.values();
//
//        //print out enum values after converting to a string
//        System.out.println(Arrays.toString(orderStatus));
//        System.out.println(Arrays.toString(shippingStatus));

        if (taxExempt.equals("Y")){
            if (shipping.equals("N")){
                if (totalCostTaxExempt > 500){
                    totalCostTaxExempt -= fiveHundredDiscountWithoutTax;
                    System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                    System.out.printf("Your total cost without tax or shipping is: %.2f\n", totalCostTaxExempt);
                }
                else if (totalCostTaxExempt > 100){
                    totalCostTaxExempt -= oneHundredDiscountWithoutTax;
                    System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                    System.out.printf("Your total cost without tax or shipping is: %.2f\n", totalCostTaxExempt);
                }
                else{
                    System.out.printf("Your total cost without tax or shipping is: %.2f\n", totalCostTaxExempt);
                }

            }else{
                if (totalCostTaxExempt > 500){
                    switch(shippingType) {
                        case "standard": {
                            if (promoCode.equals("free")){
                                totalCostTaxExempt -= fiveHundredDiscountWithoutTax;
                                System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                                System.out.printf("Your total cost without tax and free shipping is: %.2f\n", totalCostTaxExempt);
                                break;
                            }else{
                                totalCostTaxExempt -= fiveHundredDiscountWithoutTax;
                                totalCostTaxExempt += standardShipping;
                                System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                                System.out.printf("Your total cost without tax and standard shipping is: %.2f\n", totalCostTaxExempt);
                            }

                        }
                        case "twoday": {
                            totalCostTaxExempt -= fiveHundredDiscountWithoutTax;
                            totalCostTaxExempt += twoDayShipping;
                            System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                            System.out.printf("Your total cost without tax and two-day shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                        case "overnight": {
                            totalCostTaxExempt -= fiveHundredDiscountWithoutTax;
                            totalCostTaxExempt += overnightShipping;
                            System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                            System.out.printf("Your total cost without tax and overnight shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                    }
                }else if (totalCostTaxExempt > 100){
                    switch(shippingType) {
                        case "standard": {
                            if (promoCode.equals("free")){
                                totalCostTaxExempt -= oneHundredDiscountWithoutTax;
                                System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                                System.out.printf("Your total cost without tax and free shipping is: %.2f\n", totalCostTaxExempt);
                                break;
                            }else{
                                totalCostTaxExempt -= oneHundredDiscountWithoutTax;
                                totalCostTaxExempt += standardShipping;
                                System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                                System.out.printf("Your total cost without tax and standard shipping is: %.2f\n", totalCostTaxExempt);
                                break;
                            }
                        }
                        case "twoday": {
                            totalCostTaxExempt -= oneHundredDiscountWithoutTax;
                            totalCostTaxExempt += twoDayShipping;
                            System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                            System.out.printf("Your total cost without tax and two-day shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                        case "overnight": {
                            totalCostTaxExempt -= oneHundredDiscountWithoutTax;
                            totalCostTaxExempt += overnightShipping;
                            System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                            System.out.printf("Your total cost without tax and overnight shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                    }
                }else{
                    switch(shippingType) {
                        case "standard": {
                            totalCostTaxExempt += standardShipping;
                            System.out.printf("Your total cost without tax and standard shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                        case "twoday": {
                            totalCostTaxExempt += twoDayShipping;
                            System.out.printf("Your total cost without tax and two-day shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                        case "overnight": {
                            totalCostTaxExempt += overnightShipping;
                            System.out.printf("Your total cost without tax and overnight shipping is: %.2f\n", totalCostTaxExempt);
                            break;
                        }
                    }

                }

            }
        } else{
            if (shipping.equals("N")){
                if (totalCost > 500){
                    totalCost -= fiveHundredDiscountWithTax;
                    System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                    System.out.printf("Your total cost with tax and no shipping is: %.2f\n", totalCost);
                }
                else if (totalCostTaxExempt > 100){
                    totalCost -= oneHundredDiscountWithTax;
                    System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                    System.out.printf("Your total cost with tax or shipping is: %.2f\n", totalCost);
                }
                else{
                    System.out.printf("Your total cost with tax and no shipping is: %.2f\n", totalCost);
                }
            }else{
                if (totalCost > 500){
                    switch(shippingType) {
                        case "standard": {
                            totalCost -= fiveHundredDiscountWithTax;
                            totalCost += standardShipping;
                            System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                            System.out.printf("Your total cost with tax and standard shipping is: %.2f\n", totalCost);
                            break;
                        }
                        case "twoday": {
                            totalCost -= fiveHundredDiscountWithTax;
                            totalCost += twoDayShipping;
                            System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                            System.out.printf("Your total cost with tax and two-day shipping is: %.2f\n", totalCost);
                            break;
                        }
                        case "overnight": {
                            totalCost -= fiveHundredDiscountWithTax;
                            totalCost += overnightShipping;
                            System.out.println("Congrats! Since your order was over $500 we gave you a 10% discount.");
                            System.out.printf("Your total cost with tax and overnight shipping is: %.2f\n", totalCost);
                            break;
                        }
                    }
                }else if (totalCost > 100){
                    switch(shippingType) {
                        case "standard": {
                            totalCost -= oneHundredDiscountWithTax;
                            totalCost += standardShipping;
                            System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                            System.out.printf("Your total cost with tax and standard shipping is: %.2f\n", totalCost);
                            break;
                        }
                        case "twoday": {
                            totalCost -= oneHundredDiscountWithTax;
                            totalCost += twoDayShipping;
                            System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                            System.out.printf("Your total cost with tax and two-day shipping is: %.2f\n", totalCost);
                            break;
                        }
                        case "overnight": {
                            totalCost -= oneHundredDiscountWithTax;
                            totalCost += overnightShipping;
                            System.out.println("Congrats! Since your order was over $100 we gave you a 5% discount.");
                            System.out.printf("Your total cost with tax and overnight shipping is: %.2f\n", totalCost);
                            break;
                        }
                    }

                }else{
                    switch(shippingType) {
                        case "standard": {
                            totalCost += standardShipping;
                            System.out.printf("Your total cost with tax and standard shipping is: %.2f\n", totalCost);
                            break;
                        }
                        case "twoday": {
                            totalCost += twoDayShipping;
                            System.out.printf("Your total cost with tax and two-day shipping is: %.2f\n", totalCost);
                            break;
                        }
                        case "overnight": {
                            totalCost += overnightShipping;
                            System.out.printf("Your total cost with tax and overnight shipping is: %.2f\n", totalCost);
                            break;
                        }
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
