import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] answers = {"y","n"};

        Artifact myArtifact = new Artifact();
        Person discoverer = new Person();
        
        myArtifact.setName(promptUserForString("Enter the name of a new Artifact:"));
        myArtifact.setYearOfDiscovery(promptInt("Enter the year of discovery:",0,2023));
        discoverer.setFirstName(promptUserForString("What is the first name of the discoverer?"));
        discoverer.setLastName(promptUserForString("What is the last name of the discoverer?"));
        discoverer.setPrimarySpeciality(promptUserForString("What is the primary speciality of the discoverer?"));
        myArtifact.setDiscoverer(discoverer);
        String result = (promptUserForValidatedString("Is the discoverer also the curator? y/n", answers));

        if (result.equalsIgnoreCase("y")){
            myArtifact.setCurator(discoverer);
        }else {
            Person curator = new Person();
            curator.setFirstName(promptUserForString("What is the first name of the discoverer?"));
            curator.setLastName(promptUserForString("What is the last name of the discoverer?"));
            curator.setPrimarySpeciality(promptUserForString("What is the primary speciality of the discoverer?"));
            myArtifact.setCurator(curator);
        }

        System.out.println("Artifact: " + myArtifact.getName() + "\nYear of Discovery: " + myArtifact.getYearOfDiscovery() + "\nDiscoverer: " + myArtifact.getDiscoverer().getFirstName() +  " " + myArtifact.getDiscoverer().getLastName()+ ", " + discoverer.getPrimarySpeciality() + "\nCurator:" + myArtifact.getCurator().getFirstName() + " " + myArtifact.getCurator().getLastName() + ", "  + myArtifact.getCurator().getPrimarySpeciality());








    }

    public static String promptUserForString(String prompt){
        Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        String result = console.nextLine();
        return result;
    }

    public static String promptUserForValidatedString(String prompt, String[] answers){
        boolean isValid = false;
        String result = "";
        do{
            result = promptUserForString(prompt);
            for (int i = 0; i < answers.length; i++){
                if (result.equalsIgnoreCase(answers[i])){
                    isValid = true;
                    break;
                }
            }
            if (!isValid){
                System.out.println("Invalid entry, please try again");
            }
        }while (isValid == false);
        return result;
    }

    public static int promptInt(String message, int min, int max) {
        int result = 0;

        boolean isValid = false;
        while (!isValid) {
            result = userForInt(message);
            if (result > max || result < min) {
                System.out.println("Entry out of range: " + min + " - " + max + ". Try again.");
            }
            else {
                isValid = true;
            }
        }
        return result;
    }

    private static int userForInt(String prompt) {
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