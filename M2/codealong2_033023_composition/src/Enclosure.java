public class Enclosure {
    private String name;
    private Inhabitat resident;
    private double temperature;

    //region ALL getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inhabitat getResident() {
        return resident;
    }

    public void setResident(Inhabitat resident) {
        this.resident = resident;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    //endregion
}
