import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the line item map");

        System.out.println("What is your name?");
        String name = console.nextLine();

        System.out.println("What product would you like to purchase?"); //can also use system.out.print
        String product = console.nextLine();

        System.out.println("How much of this product would you like?");
        String quantityStr = console.nextLine();
        int quantity = Integer.parseInt(quantityStr);

        System.out.println("How much does this product cost?");
        String costStr = console.nextLine();
        float cost = Float.parseFloat(costStr);

        System.out.printf("Line summary for %s\n ", name);
        System.out.println("Item:               Qty\tUnit Price\tLine Total (incl. tax)");
        System.out.println("=================   ===\t==========\t==========");

        System.out.printf("%s\t%s\t$%.2f\t\t$%.2f\n",product, quantity, cost,(quantity * cost * 1.75));


    }
}