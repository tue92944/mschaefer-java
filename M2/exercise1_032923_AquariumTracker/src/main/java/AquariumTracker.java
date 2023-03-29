import java.util.Scanner;


public class AquariumTracker {
    public static void main(String[] args) {
        String species;
        String commonName;
        double maxTemp = 100.0;
        double minTemp = 0.0;
        String diet;
        boolean validInput=false;


        Fish fish1 = new Fish();

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the information for your fish:");
        System.out.print("Species Name: ");
        fish1.setSpecies(console.nextLine());


        System.out.print("Common Name: ");
        commonName = console.nextLine();
        fish1.setName(commonName);

        do {
            System.out.print("Maximum temperature: ");
            String temp = console.nextLine();
            try{
                fish1.setMaxTemp(Double.valueOf(temp));
                validInput=true;
            }
            catch (Exception e) {
                System.out.println("Enter a valid temperature");
                validInput = false;
            }
        } while(!validInput);

        do {
            System.out.print("Minimum temperature: ");
            String temp = console.nextLine();
            try{
                fish1.setMinTemp(Double.valueOf(temp));;
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("Enter a valid temperature");
                validInput = false;
            }
        } while(!validInput);

        System.out.println("Diet: ");
        fish1.setDietDescription(console.nextLine());

        System.out.println("Thank you for the input, here is the summary.");
        System.out.println("Species name: " + fish1.getSpecies());
        System.out.println("Common name: " + fish1.getName());
        System.out.println("Average Temperature: " + ((fish1.getMaxTemp() + fish1.getMinTemp())/2.0));
        System.out.println("Diet Description: " + fish1.getDietDescription());
    }
}
