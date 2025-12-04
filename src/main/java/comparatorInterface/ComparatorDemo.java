package comparatorInterface;







import java.util.*;
import java.util.List;

import static java.util.Comparator.comparing;


public class ComparatorDemo {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(10,29,2,17,35);
        Collections.sort(list);

        //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> (o1>o2)? -1 : (o1<o2)? 1:0));
        System.out.println(list);

        list.sort((o1, o2) -> ((o1>o2)? -1 : (o1<o2)? 1:0));
        System.out.println(list);
        //Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
            new Apple(45, Color.GREEN),
            new Apple(70, Color.RED),
            new Apple(120, Color.ORANGE)
        );
        Comparator<Apple> sortApple = comparing(Apple::getWeight);
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing(Apple::getWeight));
        System.out.println(myInventory);

        //Reverse
        myInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(myInventory);

        //Chaining
        myInventory
                .sort(comparing(Apple::getWeight)
                        .thenComparing(Apple::getColor));
        System.out.println(myInventory);



    }
}
