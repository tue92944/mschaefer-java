public class Invoice {
    private String item;
    private int quantity;
    private double price;
    private double taxRate;


    public double getSubtotal(int quantity, double price){
        double subTotal = (quantity*price);
        return subTotal;
    }

    public double getTax(double subTotal, double taxRate){
        double taxAmount = subTotal*taxRate;
        return taxAmount;
    }

    public double getTotal(double subTotal,double taxAmount ){
        double total = subTotal + taxAmount;
        return total;
    }
}
