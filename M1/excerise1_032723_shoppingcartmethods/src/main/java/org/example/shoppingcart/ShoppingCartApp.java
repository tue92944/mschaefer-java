package org.example.shoppingcart;

/**
 * Refactor the code to use the following methods:
 * 1. Display a list of choices from an array. Returns nothing. Needs an array
 * of choices (strings).
 * 2. Prompt the user for strings. Returns a string. Needs a string to prompt
 * the user with.
 * 3. Prompt the user for an integer. Returns an integer. Needs a string to
 * prompt the user with.
 *
 * Note: We will not create method(s) for calculating the total cost until we
 * learn more about Object-Oriented Programming and some additional data
 * structures.
 */

public class ShoppingCartApp {

  public static void main(String[] args) {
    System.out.println("Welcome to the shopping cart app!");
    String[] addresses = { "123 Main St", "456 Main St", "789 Main St" };
    String[] sizes = { "small", "medium", "large" };
    String[] validTaxExemptResponses = {"y", "n"};
    String[] validShippingResponses = {"standard", "overnight", "twoday"};

    java.util.Scanner console = new java.util.Scanner(System.in);
    boolean confirm = false;
    String taxExempt = "";
    String shipping = "";
    String promoCode = "";

    while (!confirm) {
      String address = null;
      String size = null;
      // Prompt for tax exempt
      taxExempt = promptUserForValidatedString("Are you tax-exempt? (y/n)", validTaxExemptResponses);

      // Prompt for shipping address
      while (address == null){
        try{
          displayChoices(addresses);
          int addressIndex = promptUserForInt("Shipping address?") - 1;
          address = addresses[addressIndex];
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Please enter a valid menu option");
        }

      }



      // Prompt for shipping
      shipping = promptUserForValidatedString("Shipping? (standard/overnight/twoday)", validShippingResponses);

      // Prompt for order quantity
      int orderQuantity = promptUserForInt("Order Quantity?");

      // Prompt for Size
      while (size == null){
        try{
          displayChoices(sizes);
          int sizeIndex = promptUserForInt("Size?") - 1;
          size = sizes[sizeIndex];
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Please enter a valid menu option");
        }
      }

      // Prompt for promo code
      promoCode = promptUserForString("Promo code for free shipping?");

      // Print details
      System.out.println("\nDetails:");
      System.out.println("Tax-exempt: " + taxExempt);
      System.out.println("Address: " + address);
      System.out.println("Shipping: " + shipping);
      System.out.println("Size: " + size);
      System.out.println("Order quantity: " + orderQuantity);
      System.out.println("Promo code: " + promoCode);
      System.out.println("Confirm Order y/n");
      confirm = "y".equals(console.nextLine());
    }

    System.out.println("Bye");
  }

  private static void displayChoices(String[] choices){
    for (int i = 0; i < choices.length; i++) {
      System.out.println(i + 1 + ": " + choices[i]);
    }
  }

  private static String promptUserForString(String prompt){
    java.util.Scanner console = new java.util.Scanner(System.in);
    System.out.println(prompt);
    return console.nextLine();
  }

  private static String promptUserForValidatedString(String prompt, String[] validResponses){
    boolean isValid = false;
    String result = "";
    do{
      result = promptUserForString(prompt);
      for (int i = 0; i < validResponses.length; i++){
        if (result.equalsIgnoreCase(validResponses[i])){
          isValid = true;
          break;
        }
      }
      if (!isValid){
        System.out.println("Invalid entry, please try again");
      }
    }while (isValid == false);
    return result;
  }

  private static int promptUserForInt(String prompt){
    java.util.Scanner console = new java.util.Scanner(System.in);
    boolean isValid = false;
    int result = -1;

    while (!isValid) {
      System.out.println(prompt);
      try {
        result = Integer.parseInt(console.nextLine());
        isValid = true;
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number");
      }
    }

    return result;
  }
}
