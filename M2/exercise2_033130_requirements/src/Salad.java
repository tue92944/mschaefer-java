public class Salad extends Food{
    private String dressing;

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public Salad(int quantity, double cost, String foodType, int calories, String dressing) {
        super(quantity, cost, foodType, calories);
        this.dressing = dressing;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDressing: " + dressing;
    }

}
