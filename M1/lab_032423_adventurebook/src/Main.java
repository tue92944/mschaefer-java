import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rooms = {"Room 1", "Room 2", "Room 3"};
        String[] descriptions = {"Welcome to Room 1! You have been magically transported to the tropicals islands of The Bahamas!\nThere is music playing and the sun is shining. You have also found half of a key!", "Welcome to Room 2! You have been magically transported to the cold tundra of Antarctica!\nThere are penguins playing and it is very windy. You have also found half of a key!", "Sorry, this room is locked. You must have a key to enter."};
        boolean hasVisitedRoom1 = false;
        boolean hasVisitedRoom2 = false;
        boolean hasVisitedRoom3 = false;
        boolean isPlaying = true;
        boolean hasKey = false;

        do {
            System.out.println("Welcome to the hub! Please pick a room which you would like to visit:");
            System.out.printf("1. %s\n2. %s\n3. %s", rooms[0], rooms[1], rooms[2]);
            String roomString = sc.nextLine();

            if (roomString.equals("1")) {
                if (hasVisitedRoom1 == false) {
                    hasVisitedRoom1 = true;
                    if (hasVisitedRoom2 == true) {
                        hasKey = true;
                    }
                    System.out.println(descriptions[0]);
                    System.out.println("Would you like to keep exploring?y/n");
                    String exploringInput = sc.nextLine();
                    if (exploringInput.equals("n")) {
                        isPlaying = false;
                    }
                } else {
                    System.out.println("Welcome back to Room 1! You may want to put sun screen on you are starting to burn");
                    System.out.println("Would you like to keep exploring?y/n");
                    String exploringInput = sc.nextLine();
                    if (exploringInput.equals("n")) {
                        isPlaying = false;
                    }
                }
            }
            else if (roomString.equals("2")) {
                if (hasVisitedRoom2 == false) {
                    hasVisitedRoom2 = true;
                    if (hasVisitedRoom1 == true) {
                        hasKey = true;
                    }
                    System.out.println(descriptions[1]);
                    System.out.println("Would you like to keep exploring?y/n");
                    String exploringInput = sc.nextLine();
                    if (exploringInput.equals("n")) {
                        isPlaying = false;
                    }
                } else {
                    System.out.println("Welcome back to Room 2! Brr...it's chilly here...");
                    System.out.println("Would you like to keep exploring?y/n");
                    String exploringInput = sc.nextLine();
                    if (exploringInput.equals("n")) {
                        isPlaying = false;
                    }
                }
            }
            else if (roomString.equals("3")) {
                if (hasKey == true) {
                    hasVisitedRoom3 = true;
                    System.out.println("Congratulations! You've unlocked room 3. You have been transported to the airport where you can now book a flight to anywhere you want to go!");
                    System.out.println("Would you like to keep exploring?y/n");
                    String exploringInput = sc.nextLine();
                    if (exploringInput.equals("n")) {
                        isPlaying = false;
                    }
                } else if (hasVisitedRoom3 == true) {
                    System.out.println("Welcome back to Room 3! Did you book your flight yet?");
                    System.out.println("Would you like to keep exploring?y/n");
                    String exploringInput = sc.nextLine();
                    if (exploringInput.equals("n")) {
                        isPlaying = false;
                    }
                }else{
                    System.out.println(descriptions[2]);
                }
            }
            else{
                System.out.println("Invalid choice! Try again.");
            }
        } while (isPlaying == true) ;
            System.out.println("We are sad to see you go, see you again next time!");
    }
}