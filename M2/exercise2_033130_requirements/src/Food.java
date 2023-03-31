public class Food {
    private int quantity;
    private double cost;
    private String foodType;
    private int calories;

    public Food(int quantity, double cost, String foodType, int calories) {
        this.quantity = quantity;
        this.cost = cost;
        this.foodType = foodType;
        this.calories = calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    public double totalCost(){
        return cost*quantity;
    }

    public int totalCalories(){
        return calories*quantity;
    }

    @Override
    public String toString(){
        return String.format("Quantity: " + quantity + "\nFood Type: " + foodType + "\nTotal Cost: %.2f" + "\nTotal Calories: " + totalCalories(), this.totalCost());
    }

}
