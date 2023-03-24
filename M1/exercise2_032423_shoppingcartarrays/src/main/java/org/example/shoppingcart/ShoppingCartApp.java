package org.example.shoppingcart;

import java.util.Scanner;

public class ShoppingCartApp {
  public static void main(String[] args) {
    Scanner console = new java.util.Scanner(System.in);

    System.out.println("Welcome to the shopping cart app!");

    // Create arrays to contain addresses and sizes
    String[] addresses = {"123 Main St", "456 Main St", "789 Main St"};
    String [] sizes = {"Small", "Medium", "Large"};

    // Prompt for shipping address
    System.out.println("What is your shipping address? Choose from below:");
    System.out.printf("1. %s\n2. %s\n3.%s\n", addresses[0], addresses[1], addresses[2]);
    String addressString = console.nextLine();
    int addressSelection = Integer.parseInt(addressString);
    String finalAddress = addresses[addressSelection-1];

    // Prompt for Size

    System.out.println("What size?");
    System.out.printf("1. %s\n2. %s\n3. %s", sizes[0], sizes[1], sizes[2]);
    String sizeStr = console.nextLine();
    int sizeSelection = Integer.parseInt(sizeStr);
    String finalSize = sizes[sizeSelection-1];

    // Print details
    System.out.printf("\nDetails:\n Shipping To: %s \n Size Selected: %s",finalAddress,finalSize);

    System.out.println("\nBye");
  }
}
