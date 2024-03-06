package practice7.decorator;

import lombok.ToString;

@ToString
public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCoast() {
        return pizza.getCoast() + 2.00;
    }
}
