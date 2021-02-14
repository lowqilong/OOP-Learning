
// piece of code contains arraylist object, draw memory state diagram of piece of code
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Dish> container = new ArrayList<>();

        container.add(new Dish("laksa", 5));
        container.add(new Dish("chicken rice", 4.5));
        container.add(new Dish("Meesiam", 5));

        // System.out.println(container.size());

        Dish dish = container.get(0);

        System.out.println(dish);
        System.out.println(dish.getPrice());
    }
}
