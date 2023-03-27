import java.util.Scanner;

public class Main {
    private static void displayChoices(String[] choices){
        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + 1 + ": " + choices[i]);
        }
    }

    private static String promptUserForString(String prompt){
        java.util.Scanner console = new java.util.Scanner(System.in);
        System.out.println(prompt);
        return console.nextLine();
    }

    private static int promptUserForInt(String prompt){
        java.util.Scanner console = new java.util.Scanner(System.in);
        boolean isValid = false;
        int result = -1;

        while (!isValid) {
            System.out.println(prompt);
            try {
                result = Integer.parseInt(console.nextLine());
                if (result > 0){
                    isValid = true;
                }else{
                    System.out.println("Invalid input");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }

        return result;
    }



        public static void main (String[]args){
            System.out.println("Welcome to the Text Adventure Game!\n");
            Scanner console = new Scanner(System.in);
            boolean keepRunning = true;
            boolean[] hasVisited = {false, false, false, false, false};
            String[] doors = {"The unpainted wooden door", "The black metal door", "The blue painted wooden door", "The yellow painted wooden door", "The orange painted wooden door"};
            String[] roomInitialDescriptions = {"You've entered a room lit with candles. You see a desk with find 1/4 of a key!", "You've entered a room cold and wet. Upon further inspection, you see a hole in the far wall. Something sparkles and catches your attention. It is 1/4 of a key!", "You've found a room with a red door... it's locked... do you have a key?", "You've entered a library, there is a 1/4 of a key sitting on one of the books!", "You've entered a classroom. You see 1/4 of a key underneath one of the desks!"};
            String[] roomVisitedDescriptions = {"You've entered a room lit with candles. You've been here before. There is an empty desk.", "You've entered a room cold and wet. You've been here before.", "You've found a room with a red door... you've used the key you have found and opened the door!", "This library looks familiar...", "The classroom is out of session but stay as long as you want."};

            String mainMenu = "You find yourself in a room with 5 doors. Which one do you enter?\n";
            String name = promptUserForString("Hello, Please enter your name: ");
            System.out.println("Your name is: " + name);

            while (keepRunning) {
                System.out.print(mainMenu);
                displayChoices(doors);
//                String door = null;
//                while (door == null) {
//                    try {
//                        displayChoices(doors);
//                        int doorIndex = promptUserForInt("Door selection?") - 1;
//                        door = doors[doorIndex];
//                    } catch (ArrayIndexOutOfBoundsException e) {
//                        System.out.println("Please enter a valid menu option");
//
//                    }
//
//                }
                String direction = promptUserForString("Your door selection: ");
                switch (direction) {
                    case "1":
                        if (hasVisited[0] == true) {
                            System.out.println(roomVisitedDescriptions[0]);
                        } else {
                            hasVisited[0] = true;
                            System.out.println(roomInitialDescriptions[0]);
                        }
                        break;
                    case "2":
                        if (hasVisited[1] == true) {
                            System.out.println(roomVisitedDescriptions[1]);
                        } else {
                            hasVisited[1] = true;
                            System.out.println(roomInitialDescriptions[1]);
                        }
                        break;
                    case "3":
                        if (hasVisited[0] && hasVisited[1] && hasVisited[3] && hasVisited[4]) {
                            System.out.println(roomVisitedDescriptions[2]);
                            keepRunning = false;
                        } else {
                            System.out.println(roomInitialDescriptions[2]);
                        }
                        break;
                    case "4":
                        if (hasVisited[3] == true) {
                            System.out.println(roomVisitedDescriptions[3]);
                        } else {
                            hasVisited[3] = true;
                            System.out.println(roomInitialDescriptions[3]);
                        }
                        break;
                    case "5":
                        if (hasVisited[4] == true) {
                            System.out.println(roomVisitedDescriptions[4]);
                        } else {
                            hasVisited[4] = true;
                            System.out.println(roomInitialDescriptions[4]);
                        }
                        break;
                    default:
                        System.out.println("Unable to find the door you are looking for");
                }
            }
            System.out.println("\nBye, " + name + "!");


        }
    }