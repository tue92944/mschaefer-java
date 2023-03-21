package org.example.shoppingcart;// Please start by renaming this file to ShoppingCartApp.java

public class ShoppingCartApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart app!");
        // Product:
        // Product ID is 1
        // Product Category is 2
        // Product Cost is 2.56
        // Product Price is 4.99
        // Product Quantity is 78

        //1. Assign variables to each of the elements above.

        int productID = 1;
        int productCategory = 2;
        float productCost = 2.56f;
        float productPrice = 4.99f;
        int productQuantity = 78;

        //2. Write code to calculate the total cost of the product based on the inventory.

        float totalCost = productQuantity * productCost;
        System.out.println("Total Cost is " + totalCost);

        //3. Write code to calculate the profit margin of the product.

        float profitMargin = (productPrice - productCost);
        System.out.printf("Profit Margin = $%.2f", profitMargin);

        //4. Write code to calculate the total potential profit.
        float potentialProfit = (profitMargin * productQuantity);
        System.out.println("Potential profit is " + potentialProfit);


        System.out.println("Bye");
    }
}
