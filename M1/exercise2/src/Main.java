public class Main {
    public static void main(String[] args) {

        String firstName = "Betty";
        String lastName = "Jones";
        float bmiLowThreshold = 18.5f;
        float bmiHighThreshold = 24.9f;
        int age = 32;
        int height = 2;
        int weight = 63;
        boolean isHealthy;
        float bmi = weight/(height*height);
        if (bmi >= bmiLowThreshold && bmi <= bmiHighThreshold){
            isHealthy=true;
            System.out.println("Good Job!");
        } else if (bmi< bmiLowThreshold) {
            isHealthy=false;
            System.out.println("Here's a snack");

        }
        else{
            isHealthy=false;
            System.out.println("do some more work");
        }

    }
}