import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieTicketCalculator {

    public static void main(String[] args) {
        System.out.println(calculateTicketPrice(25, "Monday"));
        System.out.println(calculateTicketPrice(15, "Saturday"));
    }
    public static double calculateTicketPrice(int age, String day) {
        List<String> weekdays = new ArrayList<>(Arrays.asList("monday","tuesday","wednesday"));
        List<String> weekends = new ArrayList<>(Arrays.asList("thursday","friday","saturday","sunday"));

        double price;
        if (weekdays.contains(day.toLowerCase())) {
            price = calculateWeekdayPrice(age);
        } else if (weekends.contains(day.toLowerCase())) {
            price = calculateWeekendPrice(age);
        } else {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
        return price;
    }

    public static double calculateWeekdayPrice(int age){
        double price;
        if (age < 18) {
            price = 6.0;
        } else if (age >= 18 && age < 65) {
            price = 8.0;
        } else {
            price = 6.5;
        }
        return price;
    }

    public static double calculateWeekendPrice(int age){
        double price;
        if (age < 18) {
            price = 8.0;
        } else if (age >= 18 && age < 65) {
            price = 10.0;
        } else {
            price = 8.5;
        }
        return price;
    }
}