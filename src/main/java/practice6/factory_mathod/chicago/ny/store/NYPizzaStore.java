package practice6.factory_mathod.chicago.ny.store;

import practice6.factory_mathod.chicago.Pizza;
import practice6.factory_mathod.chicago.PizzaStore;
import practice6.factory_mathod.chicago.ny.pizza.NYStyleCheesePizza;
import practice6.factory_mathod.chicago.ny.pizza.NYStyleClamPizza;
import practice6.factory_mathod.chicago.ny.pizza.NYStylePepperoniPizza;
import practice6.factory_mathod.chicago.ny.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
