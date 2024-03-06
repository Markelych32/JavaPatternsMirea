package practice7.decorator;

import lombok.ToString;

@ToString
public class PepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pepperoni pizza";
    }

    @Override
    public double getCoast() {
        return 10;
    }
}
