import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        import java.util.Scanner;
        class Scratch {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                boolean keepRunning = true;
                String answer = "sun";
                String letterS = answer.substring(0, 1);
                String letterU = answer.substring(1, 2);
                String letterN = answer.substring(2, 3);

                String toShow = "_".repeat(answer.length())

                int i = 0;

                int letterIndex = 0;

                while (keepRunning == true) {
                    if (i < 5) {
                        System.out.println("What is your guess?");
                        String input = sc.nextLine();
                        int whileCounter = 0;
                        while (whileCounter < answer.length()) {
                            if (input.equals(answer)) {
                                System.out.println("You got it! The word was: " + answer);
                                return;
                            } else if (input.charAt(0) == answer.charAt(whileCounter)) {

                                System.out.println(toShow);
                            }
                            else if (input.equals(letterU)) {
                                System.out.println(toShow);
                            }
                            else if (input.equals(letterN)) {
                                System.out.println(toShow);
                            }else{
                                System.out.println("Keep guessing");;
                            }
                            i++;
                        }
                    }
                    else {
                        System.out.println("Sorry, you lose!");
                        keepRunning = false;
                    }
                }
            }
        };
    }
}