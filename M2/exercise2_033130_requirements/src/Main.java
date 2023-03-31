import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Food> myOrder = new ArrayList<>();

        myOrder.add(new Pizza(1,12.50,"Entree",1300, "Pepperoni", "cheddar cheese"));
        myOrder.add(new Salad(1,7.50,"Appetizer",700,"Italian dressing"));
        myOrder.add(new Steak(1,17.00,"Entree",1400, "Well done!"));
        myOrder.add(new Cookie(10,1,"Dessert", 120, "Chocolate Chip"));

        for (Food f : myOrder) {
            System.out.println(f.toString());
        }

    }
}