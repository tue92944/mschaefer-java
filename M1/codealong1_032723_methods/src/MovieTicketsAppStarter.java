import java.util.Scanner;

public class MovieTicketsAppStarter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printWelcomeMessage();

        // Prompt user for movie title
        String movie = getString("What movie would you like to see?", console);

        // Prompt user for movie time (1pm, 2:30pm, etc.)
        // Notes:   Keeping it simple to avoid time validation challenges (later module)
        //          Current version does not validate for expected values

        String movieTime = getString("There are 3 matinees available: 1pm, 2:30pm, 4pm\nWhat time?", console, new String[]{"1pm","2:30pm","4pm"});


        // Prompt user for # of adult tickets
        int adultTix = getInt("# of Adult Tickets? ", console);

        // Prompt user for # of child tickets
        int childTix = getInt("# of Child Tickets? ", console);

        // Calculate cost: Matinee Adult: $11.75, Child: $8.25
        double totalCost = adultTix * 11.75 + childTix * 8.25;

        printPurchaseSummary(movie, movieTime, adultTix, childTix, totalCost);

    }

    private static void printPurchaseSummary(String movie, String movieTime, int adultTix, int childTix, double totalCost) {
        System.out.println("\nPurchase Complete! Summary: ");
        System.out.println("Movie:\t\t"+ movie);
        System.out.println("Time:\t\t"+ movieTime);
        System.out.println("Adult Tix:\t"+ adultTix);
        System.out.println("Child Tix:\t"+ childTix);
        System.out.println("Total Cost:\t$"+ totalCost);

        System.out.println("\nThanks!  Enjoy the show!");
    }


    public static void printWelcomeMessage() {
        System.out.println("==== Welcome to the Theater ====");
        System.out.println("Please enter the ticket info below.\n");
    }

    public static String getString(String prompt, Scanner console){
        String result = "";
        System.out.println(prompt);
        result = console.nextLine();
        return result;
    }


    public static String getString(String prompt, Scanner console, String[] values){
        boolean isValid = false;
        String input = "";
        do{
            input = getString(prompt,console);
            for (int i = 0; i < values.length; i++){
                if (input.equalsIgnoreCase(values[i])){
                    isValid = true;
                    break;
                }
            }
            if (!isValid){
                System.out.println("Invalid entry, please try again");
            }
        }while (isValid == false);
        return input;
    }

    public static int getInt(String prompt, Scanner console){
        int result = -1;
        boolean isValid = false;
        do{
            String input = getString(prompt, console);
            try {
                result = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }while(!isValid);


        return result;
    }


    //Method Signature:
        //access-modifier {static} return-type method-name(parameter(s)) { ... }
}

