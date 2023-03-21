public class Main {
    public static void main(String[] args) {

        String firstName = "Betty";
        String lastName = "Jones";
        float bmiLowThreshold = 18.5f;
        float bmiHighThreshold = 24.9f;
        int age = 32;
        int height = 2;
        int weight = 63;
        float bmi = weight/(height*height);
        if (bmi >= bmiLowThreshold && bmi <= bmiHighThreshold){
            System.out.println("Good Job!");
        } else if (bmi< bmiLowThreshold) {
            System.out.println("Here's a snack");

        }
        else{
            System.out.println("do some more work");
        }

    }
}