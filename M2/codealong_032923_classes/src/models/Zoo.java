package models;

public class Zoo {
    private String name;
    private Animal[] population;

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getPopulation() {
        return population;
    }

    public void setPopulation(Animal[] population) {
        this.population = population;
    }

    public void printPopulationReport(){
        System.out.println("Population Report: " + name);
        System.out.println("=============================================");
        System.out.println();
        for (int i = 0; i < population.length; i++) {
            Animal animal = population[i];
            System.out.println(animal.getName() + ": " + animal.getPopulationCount());
        }
        System.out.println("=============================================");
    }

    public void printAnimalSounds(){
        System.out.println("The Sounds of: " + name);
        System.out.println("=============================================");
        System.out.println();
        for (int i = 0; i < population.length; i++) {
            Animal animal = population[i];
            System.out.println(animal.getSound());
        }
        System.out.println("=============================================");
    }
}
