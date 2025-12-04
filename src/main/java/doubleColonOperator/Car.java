package doubleColonOperator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String make;
    private int model;

    public Car (){}

    public Car (int model){
       this.model = model;
    }

    public Car (String make, int model){
        this.make = make;
        this.model = model;

    }
}
