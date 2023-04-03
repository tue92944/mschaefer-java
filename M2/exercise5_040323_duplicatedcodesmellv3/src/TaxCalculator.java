public class TaxCalculator {

    public static void main(String[] args) {
        System.out.println(calculateTax("Electronics", 1000));
        System.out.println(calculateTax("Clothing", 200));
        System.out.println(calculateTax("Groceries", 50));
    }

    public static double calculateTax(String itemType, double price) {
        double tax;

        if (itemType.equalsIgnoreCase("Electronics")) {
            tax = calculateElectronicTax(price);
        } else if (itemType.equalsIgnoreCase("Clothing")) {
            tax = calculateClothingTax(price);
        } else if (itemType.equalsIgnoreCase("Groceries")) {
            tax = calculateGroceryTax(price);
        } else {
            throw new IllegalArgumentException("Invalid item type: " + itemType);
        }
        return tax;
    }

    public static double calculateElectronicTax(double price){
        double baseTax = 0.15 * price;
        double luxuryTax = price > 1000 ? 0.05 * price : 0.0;
        return baseTax + luxuryTax;
    }

    public static double calculateClothingTax(double price){
        double baseTax = 0.07 * price;
        double luxuryTax = price > 500 ? 0.03 * price : 0.0;
        return baseTax + luxuryTax;
    }

    public static double calculateGroceryTax(double price){
        double baseTax = 0.05 * price;
        double luxuryTax = price > 200 ? 0.02 * price : 0.0;
        return baseTax + luxuryTax;
    }
}