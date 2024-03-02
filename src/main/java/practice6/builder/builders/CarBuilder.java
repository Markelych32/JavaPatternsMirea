package practice6.builder.builders;

import practice6.builder.model.Car;

public interface CarBuilder {
    CarBuilder fixChassis();
    CarBuilder fixBody();
    CarBuilder paint();
    CarBuilder fixInterior();
    Car build();
}
