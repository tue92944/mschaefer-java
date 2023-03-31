public class AquariumFish extends Fish{
    private String nickname;
    private String food;
    private double maxTemp;
    private double minTemp;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    @Override
    public String toString(){
        return "This aquarium fish has the nickname: " + nickname +"\nIt is of species: " + getScientificName();
    }
}
