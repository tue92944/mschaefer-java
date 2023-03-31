public class Steak extends Food{
    private String howItIsCooked;

    public String getHowItIsCooked() {
        return howItIsCooked;
    }

    public void setHowItIsCooked(String howItIsCooked) {
        this.howItIsCooked = howItIsCooked;
    }

    public Steak(int quantity, double cost, String foodType, int calories, String howItIsCooked) {
        super(quantity, cost, foodType, calories);
        this.howItIsCooked = howItIsCooked;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHow it is cooked: " + howItIsCooked;
    }
}
