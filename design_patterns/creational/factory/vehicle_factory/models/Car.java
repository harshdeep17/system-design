package design_patterns.creational.factory.vehicle_factory.models;


import design_patterns.creational.factory.vehicle_factory.interfaces.IBody;
import design_patterns.creational.factory.vehicle_factory.interfaces.IEngine;
import design_patterns.creational.factory.vehicle_factory.interfaces.IWheel;

public abstract class Car extends Vehicle {
    public Car(IEngine engine, IBody body, IWheel wheel) {
        super(engine, body, wheel);
    }
}
