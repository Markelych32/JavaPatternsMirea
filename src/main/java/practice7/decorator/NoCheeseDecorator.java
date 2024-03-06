package practice7.decorator;

public class NoCheeseDecorator extends PizzaDecorator {

    public NoCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().replace(", Cheese", "");
    }

    @Override
    public double getCoast() {
        return pizza.getCoast() - 2.00;
    }
}
