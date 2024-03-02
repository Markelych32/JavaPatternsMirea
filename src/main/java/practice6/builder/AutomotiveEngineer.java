package practice6.builder;

import practice6.builder.builders.CarBuilder;
import practice6.builder.model.Car;

public class AutomotiveEngineer {
    private final CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }
}
