import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class Scratch {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int answer = 17;
                boolean keepRunning = true;
                int numberOfGuesses = 3;
                int counter = 0;

                while (keepRunning == true){
                    if (counter < 3){
                        System.out.println("Please guess a number between 1-20.");
                        int input = Integer.parseInt(sc.nextLine());
                        if (input < answer){
                            numberOfGuesses--;
                            counter++;
                            System.out.println("Your number is too low, try a higher number! You have this many guesses left: " + numberOfGuesses);
                        }else if (input > answer){
                            numberOfGuesses--;
                            counter++;
                            System.out.println("Your number is too high, try a lower number! You have this many guesses left: " + numberOfGuesses);
                        }else{
                            System.out.println("You got it right!Would you like to play again?");
                        }

                    }
                    else{
                        System.out.println("You lose! Play again?");
                        break;
                    }
                }

            };
    }
}