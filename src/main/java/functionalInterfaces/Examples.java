package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        Predicate <Integer> lessThan = a -> a<18;
        boolean result = lessThan.test(30);
        System.out.println(result);

        Consumer <Integer> consumer = i -> System.out.println(i);
        consumer.accept(30);
        //==========BiConsumer===========
        // accept two parameters but doesn't return anything
        BiConsumer<Integer, Integer> biConsumer = (x, y)-> System.out.println(x + y);
        biConsumer.accept(14, 22);

        //======================FUNCTION================
        Function <Integer, String> fun = s -> s + " years old";
        String var = fun.apply(50);
        System.out.println(var);

        //============SUPPLIER =========================
        Supplier <Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
