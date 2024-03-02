package practice6.builder;

import practice6.builder.builders.CarBuilder;
import practice6.builder.builders.concreteBuilders.ClassicCarBuilder;
import practice6.builder.builders.concreteBuilders.ModernCarBuilder;
import practice6.builder.builders.concreteBuilders.SportsCarBuilder;
import practice6.builder.model.Car;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ModernCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}
