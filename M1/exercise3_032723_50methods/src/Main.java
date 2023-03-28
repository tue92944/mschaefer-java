public class Main {
    public static int sumOfTwoIntegers (int a, int b){
        int sum = a + b;
        return sum;
    }

    public static String concatTwoStrings (String a, String b){
        String newString = a + " " + b;
        return newString;
    }

    public static int numOfCharacters (String a){
        int result = a.length();
        return result;
    }

    public static int squareNumber (int a){
        int newInt = a * a;
        return newInt;
    }

    public static String stringWithConcatInt(String a, int b){
        String newString = a + " " + b;
        return newString;
    }

    public static String upperCase(String a){
        String newString = a.toUpperCase();
        return newString;
    }

    public static String lexicographOrder (String a, String b) {
        int result = a.compareTo(b);
        String outcome = null;
        if (result < 0){
            outcome = a;
        }else if (result == 0){
            outcome = "The words are equal";
        }else{
            outcome = b;
        }
        return outcome;
    }

    public static String repeatByNumber(String a, int b){
        String output = "";
        for (int i = 0; i< b; i++){
            output += a;
        }
        return output;
    }

    public static int sumOfArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }





    public static void main(String[] args) {
        System.out.println(sumOfTwoIntegers(1,2));
        System.out.println(concatTwoStrings("Hi","Meghan"));
        System.out.println(numOfCharacters("test"));
        System.out.println(squareNumber(2));
        System.out.println(stringWithConcatInt("Hello",4));
        System.out.println(upperCase("hello"));
        System.out.println(lexicographOrder("Test", "Apple"));
        System.out.println(repeatByNumber("hi",4));
        System.out.println(sumOfArray(new int[]{1,3}));
    }
}