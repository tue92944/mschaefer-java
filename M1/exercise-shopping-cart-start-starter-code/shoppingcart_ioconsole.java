import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your word?");
        String input = sc.nextLine().toLowerCase();
        String output= "";
        int i = 0;
        while (i<input.length()){
            char c = input.charAt(i);
            i++;

            if (c == 'z'){
                output += 'a';
                continue;
            }

            output += (char)(c + 1);
        }
        System.out.println(output);

    }
}