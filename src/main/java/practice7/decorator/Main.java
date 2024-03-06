package practice7.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PepperoniPizza();
        System.out.println(pepperoniPizza.getDescription() + ": $" + pepperoniPizza.getCoast());

        pepperoniPizza = new CheeseDecorator(pepperoniPizza);
        System.out.println(pepperoniPizza.getDescription() + ": $" + pepperoniPizza.getCoast());

        pepperoniPizza = new NoCheeseDecorator(pepperoniPizza);
        System.out.println(pepperoniPizza.getDescription() + ": $" + pepperoniPizza.getCoast());
    }
}
