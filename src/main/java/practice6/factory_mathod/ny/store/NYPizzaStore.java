package practice6.factory_mathod.ny.store;

import practice6.factory_mathod.Pizza;
import practice6.factory_mathod.PizzaStore;
import practice6.factory_mathod.ny.pizza.NYStyleCheesePizza;
import practice6.factory_mathod.ny.pizza.NYStyleClamPizza;
import practice6.factory_mathod.ny.pizza.NYStylePepperoniPizza;
import practice6.factory_mathod.ny.pizza.NYStyleVeggiePizza;

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
