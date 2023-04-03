import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rng = new Random();
    static final int upperBound = 100;
    static final int lowerBound = 0;

    public static void main(String[] args) {
        boolean isBandit = false;
        int cityDistance = 200;
        int round = 0;
        int rndNumber = 0;
        Scanner sc = new Scanner(System.in);
        boolean isWantsToPlay = false;
        String input;

        Shopkeeper myShopKeeper = new Shopkeeper("Meghan", false, 30,0);

        while (myShopKeeper.getGold() >= 0 ) {
            displayMenu(myShopKeeper);


            if (myShopKeeper.isHasGuard() == true) {
                if (rndNumber <= myShopKeeper.getPercentage()) {
                    System.out.println("Unfortunately, you have run into a bandit. But luckily you have a guard! Your guard saved you, but now you are guardless ");
                    myShopKeeper.setHasGuard(false);
                    myShopKeeper.setNumberOfRounds(myShopKeeper.getNumberOfRounds()+1);
                    myShopKeeper.setDistanceTravelled(myShopKeeper.getDistanceTravelled()+ 50);
                    if (myShopKeeper.getDistanceTravelled() % 200 == 0) {
                        myShopKeeper.setHasGuard(false);
                        if (myShopKeeper.getPercentage() <= 55){
                            myShopKeeper.setPercentage(myShopKeeper.getPercentage() + 5);
                        }else{
                            myShopKeeper.setPercentage(60);
                        }
                        System.out.println("Congrats! You travelled 200 miles to your next city");
                        System.out.println("Would you like to purchase a guard for 20 gold? (y/n)");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                            myShopKeeper.setGold(myShopKeeper.getGold()-20);
                            myShopKeeper.setHasGuard(true);
                            System.out.println("Now you have " + myShopKeeper.getGold() + " many golds available");
                            System.out.println("You have purchased a guard.");
                        }
                    }
                    myShopKeeper.setGold(myShopKeeper.getGold()+15);
                }else{
                    System.out.println("Congrats! You made it this round with no bandits.");
                    myShopKeeper.setNumberOfRounds(myShopKeeper.getNumberOfRounds()+1);
                    myShopKeeper.setDistanceTravelled(myShopKeeper.getDistanceTravelled()+ 50);
                    if (myShopKeeper.getDistanceTravelled() % 200 == 0) {
                        if (myShopKeeper.getPercentage() <= 55){
                            myShopKeeper.setPercentage(myShopKeeper.getPercentage() + 5)
                        }else{
                            myShopKeeper.setPercentage(60);
                        }
                        myShopKeeper.setHasGuard(false);
                        System.out.println("Congrats! You travelled 200 miles to your next city");
                        System.out.println("Would you like to purchase a guard for 20 gold? (y/n)");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                            myShopKeeper.setGold(myShopKeeper.getGold()-20);
                            myShopKeeper.setHasGuard(true);
                            System.out.println("Now you have " + myShopKeeper.getGold() + " many golds available");
                            System.out.println("You have purchased a guard.");
                        }
                    }
                    myShopKeeper.setGold(myShopKeeper.getGold()+15);

                }
            }else{
                if (rndNumber <= myShopKeeper.getPercentage()) {
                    System.out.println("Unfortunately, you have run into a bandit. You do not have a guard and need to pay the bandit 10 gold. ");
                    myShopKeeper.setGold(myShopKeeper.getGold()-10);
                    myShopKeeper.setNumberOfRounds(myShopKeeper.getNumberOfRounds()+1);
                    myShopKeeper.setDistanceTravelled(myShopKeeper.getDistanceTravelled()+ 50);
                    if (myShopKeeper.getDistanceTravelled() % 200 == 0) {
                        if (myShopKeeper.getPercentage() <= 55){
                            myShopKeeper.setPercentage(myShopKeeper.getPercentage() + 5)
                        }else{
                            myShopKeeper.setPercentage(60);
                        }
                        myShopKeeper.setHasGuard(false);
                        System.out.println("Congrats! You travelled 200 miles to your next city");
                        System.out.println("Would you like to purchase a guard for 20 gold? (y/n)");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                            myShopKeeper.setGold(myShopKeeper.getGold()-20);
                            myShopKeeper.setHasGuard(true);
                            System.out.println("Now you have " + myShopKeeper.getGold() + " many golds available");
                            System.out.println("You have purchased a guard.");
                        }
                    }
                    myShopKeeper.setGold(myShopKeeper.getGold()+15);


                }else{
                    System.out.println("Congrats! You made it this round with no bandits.");
                    myShopKeeper.setNumberOfRounds(myShopKeeper.getNumberOfRounds()+1);
                    myShopKeeper.setDistanceTravelled(myShopKeeper.getDistanceTravelled()+ 50);
                    if (myShopKeeper.getDistanceTravelled() % 200 == 0) {
                        myShopKeeper.setHasGuard(false);
                        if (myShopKeeper.getPercentage() <= 55){
                            myShopKeeper.setPercentage(myShopKeeper.getPercentage() + 5)
                        }else{
                            myShopKeeper.setPercentage(60);
                        }
                        System.out.println("Congrats! You travelled 200 miles to your next city");
                        System.out.println("Would you like to purchase a guard for 20 gold? (y/n)");
                        input = sc.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                            myShopKeeper.setGold(myShopKeeper.getGold()-20);
                            myShopKeeper.setHasGuard(true);
                            System.out.println("Now you have " + myShopKeeper.getGold() + " many golds available");
                            System.out.println("You have purchased a guard.");
                        }
                    }
                    myShopKeeper.setGold(myShopKeeper.getGold()+15);

                }

            }
            System.out.println("Are you ready for the next round? y/n");
            String readyForNextRound = sc.nextLine();
            if (readyForNextRound.equalsIgnoreCase("y")){
                continue;
            }else{
                break;
            }

        }
        System.out.println("Do you want to play again?Y/N");
    }

    public static void displayMenu(Shopkeeper myShopKeeper){
        int rndNumber = 0;
        Scanner sc = new Scanner(System.in);
        rndNumber = rng.nextInt(lowerBound, upperBound)+1;
        System.out.println("Let's play!");
        System.out.println("Round " + myShopKeeper.getNumberOfRounds());
        System.out.println("Your available gold: " + myShopKeeper.getGold());
        if (myShopKeeper.isHasGuard()) {
            System.out.println("You have a guard");
        }
        else {
            System.out.println("You have no guard");
        }

        System.out.println("You have travelled " + myShopKeeper.getDistanceTravelled() + " mile(s)");
        System.out.println("Percentage of running into bandit is " + myShopKeeper.getPercentage() + "%");
        if (myShopKeeper.isHasGuard() == false){
            System.out.println("Would you like to purchase a guard for 20 gold? (y/n)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("y")) {
                myShopKeeper.setGold(myShopKeeper.getGold()-20);
                myShopKeeper.setHasGuard(true);
                System.out.println("Now you have " + myShopKeeper.getGold() + "golds available");
                System.out.println("You have purchased a guard.");
            }
            System.out.println("You are about to travel to the next round. Hopefully you don't run into a bandit. Good luck.");
        }

    }
}