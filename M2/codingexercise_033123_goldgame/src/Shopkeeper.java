public class Shopkeeper {
    private String name;
    private boolean hasGuard = false;
    private int gold;
    private float distanceTravelled = 0.0f;
    private int percentage = 5;

    int numberOfRounds = 1;

    public Shopkeeper(String name, boolean hasGuard, int gold, float distanceTravelled, int numberOfRounds, int percentage) {
        this.name = name;
        this.hasGuard = hasGuard;
        this.gold = gold;
        this.distanceTravelled = distanceTravelled;
        this.numberOfRounds = numberOfRounds;
        this.percentage = percentage;

    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasGuard() {
        return hasGuard;
    }

    public void setHasGuard(boolean hasGuard) {
        this.hasGuard = hasGuard;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public float getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(float distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}

