public class Pizza extends Food{
    private String topping;
    private String cheeseType;

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public Pizza(int quantity, double cost, String foodType, int calories, String topping, String cheeseType) {
        super(quantity, cost, foodType, calories);
        this.cheeseType = cheeseType;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTopping: " + topping + "\nCheese Type: " + cheeseType;
    }

}
