package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        //zero arg
        Supplier <Car> c1 = ()-> new Car();
        System.out.println(c1.get().getModel());

        Supplier <Car> c2 = Car::new;
        System.out.println(c2.get().getModel());
        //one arg
        Function <Integer, Car> f1 = model -> new Car(model);
        Car RAW4 = f1.apply(2024);
        System.out.println(RAW4);

        Function <Integer, Car> f2 = Car::new;
        Car RAW42 = f1.apply(2019);
        System.out.println(RAW42);

        //two arg
        BiFunction <String, Integer, Car> b1 = (make, model)-> new Car(make, model);
        Car RAW4_XLE = b1.apply("Toyota", 2024);
        System.out.println(RAW4_XLE.getMake() + ", " + RAW4_XLE.getModel());

        BiFunction <String, Integer, Car> b2 = Car::new;
        Car RAW4_LIMIT = b2.apply("Toyota", 2019);
        System.out.println(RAW4_LIMIT.getMake() + ", " + RAW4_LIMIT.getModel());


    }
}
