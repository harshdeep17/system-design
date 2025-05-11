package design_patterns.creational.factory.vehicle_factory.models;

import design_patterns.creational.factory.vehicle_factory.interfaces.IBody;
import design_patterns.creational.factory.vehicle_factory.interfaces.IEngine;
import design_patterns.creational.factory.vehicle_factory.interfaces.IWheel;

public abstract class Vehicle {
    protected final IEngine engine;
    protected final IBody body;
    protected final IWheel wheel;

    public Vehicle(IEngine engine, IBody body, IWheel wheel) {
        this.engine = engine;
        this.body = body;
        this.wheel = wheel;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    @Override
    public String toString() {
        return String.format("Engine: %s, Body: %s, Wheel: %s",
                engine.getClass().getSimpleName(),
                body.getClass().getSimpleName(),
                wheel.getClass().getSimpleName());
    }
}

