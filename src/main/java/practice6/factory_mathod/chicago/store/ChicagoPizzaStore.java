package practice6.factory_mathod.chicago.store;

import practice6.factory_mathod.chicago.Pizza;
import practice6.factory_mathod.chicago.PizzaStore;
import practice6.factory_mathod.chicago.pizza.ChicagoStyleCheesePizza;
import practice6.factory_mathod.chicago.pizza.ChicagoStyleClamPizza;
import practice6.factory_mathod.chicago.pizza.ChicagoStylePepperoniPizza;
import practice6.factory_mathod.chicago.pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}