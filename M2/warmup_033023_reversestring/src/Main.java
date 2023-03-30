import java.util.Scanner;

public class Main {

    public static String reverseSentence (){
        String sentence = getString("what is your input");
        String[] sentenceArray = sentence.split(" ");
        String result = "";
        for (int i = sentenceArray.length-1; i>=0; i--){
            result+= sentenceArray[i] + " ";
        }
        return result;
    }

    public static String getString(String prompt){
        Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        return console.nextLine();
    }
    public static void main(String[] args) {
        System.out.println(reverseSentence());
    }
}