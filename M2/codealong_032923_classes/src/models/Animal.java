package models;

public class Animal {
    private String name;
    private int populationCount;
    private String sound;

    public Animal(String name, int populationCount, String sound){
        this.name = name;
        this.populationCount = populationCount;
        this.sound = sound;

    }
    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;

    }
    public int getPopulationCount() {
        return populationCount;
    }

    public void setPopulationCount(int populationCount) {
        this.populationCount = populationCount;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
