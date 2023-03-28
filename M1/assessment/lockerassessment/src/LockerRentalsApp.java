import java.util.Scanner;

import static java.lang.System.exit;

public class LockerRentalsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lockers = new String[5];
        String[] lockerPins = {"0001", "0002", "0003", "0004", "0005"};
        String[] menuOptions = {"Rent a Locker", "Access A Locker", "Release A Locker"};
        String [] noLockersMenuOptions = {"Access A Locker", "Release A Locker"};
        String [] confirmValues = {"y","n"};
        boolean isRunning = false;
        boolean checkedAvailability = false;
        int lockerIndex = 0;
        String mainMenu = "What would you like to do next?\n\t1. Rent a Locker\n\t2. Access a Locker\n\t3. Release A Locker\n\t ---\n\t Any other key to exit.";
        String mainMenuNoAvailableLockers = "What would you like to do next?\n\t1. Access a Locker\n\t2. Release A Locker\n\t ---\n\t Any other key to exit.";

        // run this code as long as user is running application

        do{
            String menuSelection = null;
            String noLockersMenuSelection = null;

            //prompt for menu selection
            while (menuSelection == null && noLockersMenuSelection == null){
                //check to see if there are any empty lockers available
                        if (lockers[0]==null || lockers[1]==null || lockers[2]==null || lockers[3]==null || lockers[4]==null){
                            try {
                                //this is code to prompt for the main menu giving the rent a locker option
                                int userInput = exitValidation(mainMenu) - 1;
                                menuSelection = menuOptions[userInput];

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Goodbye!");
                                return;
                            }
                        } else {
                            try {
                                //this is code to prompt for the menu to disable the rent a locker option if none are available
                                int userInput = exitValidation(mainMenuNoAvailableLockers) -1;
                                menuSelection = noLockersMenuOptions[userInput];
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Goodbye!");
                                return;
                            }
                        }
            }

            //rent a locker selection
            if (menuSelection == menuOptions[0]){
                do{
                    for ( int i = 0; i<lockers.length; i++ ){
                        if (lockers[i] == null){
                            String lockerValue = Integer.toString(i + 1);
                            lockers[i] = lockerValue;
                            System.out.println("You have rented Locker " + lockerValue + "\nYour pin is: " + lockerPins[i]);
                            checkedAvailability = true;
                            break;
                        }
                    }
                }while (checkedAvailability == false);

            }

            //access a locker selection based off both menus
            if (menuSelection == menuOptions[1] || menuSelection == noLockersMenuOptions[0]){
                //set a variable for the users locker input, checking to make sure it is an actual rented out locker
                String rentedLockerStr = promptUserForValidatedString("What locker number do you have rented?","Sorry, this locker is not rented. Try again.", lockers);
                //make the users locker input an integer
                int rentedLocker = Integer.parseInt(rentedLockerStr);
                // get the users pin input
                String pinInput = promptUserForValidatedString("What is your pin?","Incorrect pin. Try again.",lockerPins);

                //if statement to check if the user input matches the correct pin
                if (pinInput.equalsIgnoreCase(lockerPins[rentedLocker-1])){
                    System.out.println("Success!Lock it up when you're done. Pin remains the same.");
                }
            }

            // release a locker selection

            if (menuSelection == menuOptions[2] || menuSelection == noLockersMenuOptions[1]){
                String rentedLockerStr = promptUserForValidatedString("What locker number do you have rented?","Sorry, this locker is not rented. Try again.", lockers);
                int rentedLocker = Integer.parseInt(rentedLockerStr);
                if (lockers[rentedLocker-1] == null){
                    System.out.println("That locker is not rented, try again.");
                } else {
                    String pinInput = promptUserForValidatedString("What is your pin?","Invalid pin. Try again.",lockerPins);
                    // check if pin is correct
                    if (pinInput.equalsIgnoreCase(lockerPins[rentedLocker-1])){
                       String confirm = promptUserForValidatedString("Are you sure you want to release the locker? y/n","Must be a y or n to proceed.", confirmValues);
                       if (confirm.equalsIgnoreCase("y")){
                           System.out.println("Success! Locker has been released.");
                           lockers[rentedLocker-1] = null;
                       } else {
                           System.out.println("Locker has not been released.");

                       }
                    }
                }
            }


        }while (isRunning == false);

    }


    public static String promptUserForString(String prompt) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        System.out.println(prompt);
        return console.nextLine();
    }

    public static String promptUserForValidatedString(String prompt,String error, String[] validResponses){
        boolean isValid = false;
        String result = "";
        do{
            result = promptUserForString(prompt);
            for (int i = 0; i < validResponses.length; i++){
                if (result.equalsIgnoreCase(validResponses[i])){
                    isValid = true;
                    break;
                }
            }
            if (!isValid){
                System.out.println(error);
            }
        }while (isValid == false);
        return result;

    }


    public static int exitValidation(String prompt) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        boolean isValid = false;
        int result = -1;

        while (!isValid) {
            System.out.println(prompt);
            try {
                result = Integer.parseInt(console.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Goodbye!");
                System.exit(1);
            }
        }

        return result;
    }

    public static int promptUserForInt(String prompt) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        boolean isValid = false;
        int result = -1;

        while (!isValid) {
            System.out.println(prompt);
            try {
                result = Integer.parseInt(console.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }

        return result;
    }




}