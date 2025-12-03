import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List <Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, Color.RED));
        inventory.add(new Apple(155, Color.GREEN));
        inventory.add(new Apple(120, Color.ORANGE));

//        List<Apple> appleColor = filterApples(inventory, new AppleColorPredicate());
//        System.out.println(appleColor);
//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
//        System.out.println(heavyApple);
//        List<Apple> lightApple = filterApples(inventory, new AppleLightPredicate());
//        System.out.println(lightApple);

//        List<Apple> lightApples = inventory.stream()
//                .filter(apple -> apple.getWeight() < 100)
//                .toList();

          List <Apple> greenColor = filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));
          System.out.println(greenColor);
//        prettyPrintApple2(inventory, new AppleFancyFormatter());
//        prettyPrintApple2(inventory, new AppleSimpleFormatter());

    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory){
//            if (applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }

    private static void prettyPrintApple2(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple : inventory){
            String output = formatter.format(apple);
            System.out.println(output);
        }
    }

//    private static void prettyPrintApple(List<Apple> inventory, Function<Apple, String> formatter){
//        for (Apple apple : inventory){
//            if(apple.getWeight() < 100) {
//                String output = formatter.apply(apple);
//                System.out.println(output);
//            }else if (apple.getWeight() < 125 & apple.getWeight() >100){
//                System.out.println("A Light " + apple.getColor() + " apple  An apple of " + apple.getWeight());
//            }else System.out.println("A Heavy " + apple.getColor() + " apple An apple of " + apple.getWeight());
//        }
//    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> appleP) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (appleP.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
