package doubleColonOperator;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        //Reference to a static method. Below we use two ways to calculate
        Calculate sum = ((x, y) -> Calculator.findSum(x, y)); // or
        sum.calculate(10, 15);
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10,15);

        //Reference to a instance method. Below we use two ways to calculate
        Calculate multipleSum = (x, y) -> new Calculator().findMultiply(x, y);
        multipleSum.calculate(10, 15);

        Calculate multipleSum2 = new Calculator()::findMultiply;
        multipleSum2.calculate(10, 15);

        //first way
        BiFunction <String, Integer, String> fn = (Str, i)-> Str.substring(i);
        System.out.println(fn.apply("Afrayin", 4));
        //Second way. Double colon operator
        BiFunction <String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Ankar", 3));

        Consumer <Integer> con = s -> System.out.println(s);
        con.accept(22);
        Consumer <Integer> con2 = System.out::println;
        con2.accept(14);

    }
}
