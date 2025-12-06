package task;

import java.util.Arrays;
import java.util.List;

public class DishData {
    public static List<Dish> getAll(){
        boolean vegetarian;
        return Arrays.asList(
                new Dish("Beef", false, 800, Type.MEAT),
                new Dish("Lamb", false, 500, Type.MEAT),
                new Dish("French fries", true, 170, Type.OTHER),
                new Dish("Shrimp", false, 300, Type.FISH),
                new Dish("Salmon", false, 350, Type.FISH),
                new Dish("Rice", true, 200, Type.OTHER),
                new Dish("Apple", true, 50, Type.OTHER),
                new Dish("Chicken", false, 500, Type.MEAT)

        );
    }
}
