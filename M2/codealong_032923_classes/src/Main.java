import models.Animal;
import models.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Kalama Zoo");
        Animal lion = new Animal("Lion", 5, "Grrr");
        Animal tiger = new Animal("Tiger", 2, "ROAR");
        Animal bear = new Animal("Bear", 2, "growlsplash");

        Animal[] population = new Animal[3];
        population[0] = lion;
        population[1] = tiger;
        population[2] = bear;

        zoo.setPopulation(population);
        zoo.printPopulationReport();
        zoo.printAnimalSounds();




//        Animal tiger = new Animal("Tiger", 5, "Rawr");
//        Animal platypus = new Animal("Platypus", 27, "quack");
//        Animal clone = tiger;
//
//
//        doSomething(tiger);
//        int x = 4;
//        doSomethingElse(x);
//        System.out.println(x);
//
//
//        System.out.printf("We have %s %s and they sound like %s\n", tiger.getPopulationCount(), tiger.getName(), tiger.getSound());
//        System.out.printf("We have %s %s and they sound like %s", platypus.getPopulationCount(), platypus.getName(), platypus.getSound());
    }

    public static void doSomething(Animal animal){
        int amount = animal.getPopulationCount();
        amount += 2;
        animal.setPopulationCount(amount);
    }

    public static void doSomethingElse(int a){
        a = a + 1;
    }
}
